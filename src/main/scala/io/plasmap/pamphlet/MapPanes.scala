package io.plasmap.pamphlet

import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js

/**
 * Created by mark on 28.05.15.
 */
trait MapPanes extends js.Object {
  val mapPane:HTMLElement
  val tilePane:HTMLElement
  val objectsPane:HTMLElement
  val shadowPane:HTMLElement
  val overlayPane:HTMLElement
  val markerPane:HTMLElement
  val popupPane:HTMLElement
}
