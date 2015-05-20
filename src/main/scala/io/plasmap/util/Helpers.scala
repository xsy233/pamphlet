package io.plasmap.util

import scala.concurrent.{ExecutionContext, Future}
import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.util.{Failure, Success, Try}
//import scalaz.Scalaz._
//import scalaz.concurrent.Task

object Helpers {
  implicit class RichTry[A](t:Try[A]) {
    def asFuture:Future[A] = t match {
      case Success(v) ⇒ Future successful v
      case Failure(f) ⇒ Future failed f
    }
  }

  def objectPropValues(o: js.Object): Stream[(String, js.Any)] = {
    val d = o.asInstanceOf[js.Dynamic]
    js.Object.properties(o).toStream.map(n => {
      val v = (try d.selectDynamic(n) catch{case t:Throwable => t.toString}).asInstanceOf[js.Any]
      n → v
    })
  }

  abstract class JSOptionBuilder[T <: js.Object, B <: JSOptionBuilder[T, _]](copy:Map[String, Any] => B) {
    def dict:Map[String, Any]

    def jsOpt(name:String, opt:Any):B =  copy(dict + (name -> opt))

    def build = dict.toJSDictionary.asInstanceOf[T]

    override def toString = {
      s"""{\n${dict.keys.map{ key => s"  $key = ${dict(key).toString}"}.mkString("\n")}\n}"""
    }
  }

  def inspectObject(o: js.Object): String = {
    val s = objectPropValues(o).sortBy(_._1)
    val ss = s.map { case (k, v) =>
      (k, js.typeOf(v), ("" + v).split('\n')(0))
    }
    val sz = s.size
    val nlen = sz.toString.length
    val klen = ss.map(_._1.length).max
    val tlen = ss.map(_._2.length).max
    val fmt = s"  [%${nlen}d/$sz] %-${klen}s : %-${tlen}s = %s"
    var i = 0
    ss.map { case (k, t, v) =>
      i = i + 1
      fmt.format(i, k, t, v)
    }.mkString(s"$o\n", "\n", "")
  }
  implicit class StringableJson(x:js.Any) { def str:String = js.JSON.stringify(x) }

//  implicit class RichFuture[A](val self: Future[A]) extends AnyVal {
//    def asTask(implicit EC: ExecutionContext): Task[A] =
//      Task.async {
//        register =>
//          self.onComplete {
//            case Success(v) => register(v.right)
//            case Failure(ex) => register(ex.left)
//          }
//      }
//  }
}

