package io.plasmap.pamphlet

import scala.scalajs.js

/**
 * Created by mark on 25.02.15.
 */
trait ILayer extends scalajs.js.Object {
  def onAdd(map:LeafletMap):Unit = js.native
  def onRemove(map:LeafletMap):Unit = js.native
}
