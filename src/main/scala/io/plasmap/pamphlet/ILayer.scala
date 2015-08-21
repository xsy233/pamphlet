package io.plasmap.pamphlet

import io.plasmap.pamphlet.LeafletEvents.LeafletMouseEvent

import scala.scalajs.js

/**
 * Created by mark on 25.02.15.
 */
trait ILayer extends scalajs.js.Object {
  def onAdd(map:LeafletMap):Unit = js.native
  def onRemove(map:LeafletMap):Unit = js.native
  def on(eventName:String, fn:js.Any) = js.native
  def off(eventName:String) = js.native
}

object ILayer {
  implicit class OnHandlers(val self:ILayer) extends AnyVal {
    def onClick      (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("click", cb)
    def onDoubleClick(cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("doubleclick", cb)
    def onMouseDown  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mousedown", cb)
    def onMouseUp    (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseup", cb)
    def onMouseOver  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseover", cb)
    def onMouseOut   (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseout", cb)
    def onMouseMove  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mousemove", cb)
    def contextMenu  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("contextmenu", cb)

    def disableAllOnClick      (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("click")
    def disableAllOnDoubleClick(cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("doubleclick")
    def disableAllOnMouseDown  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mousedown")
    def disableAllOnMouseUp    (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseup")
    def disableAllOnMouseOver  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseover")
    def disableAllOnMouseOut   (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseout")
    def disableAllOnMouseMove  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mousemove")
    def disableAllContextMenu  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("contextmenu")
  }
}