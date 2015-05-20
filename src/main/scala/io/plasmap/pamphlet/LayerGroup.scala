package io.plasmap.pamphlet

import scala.scalajs.js

/**
 * Created by mark on 26.02.15.
 */
trait LayerGroup extends ILayer{
  def addTo(map:LeafletMap):LayerGroup = js.native
  def addLayer(layer:ILayer):LayerGroup = js.native
  def removeLayer(layer:ILayer):LayerGroup = js.native
  def removeLayer(id:String):LayerGroup = js.native
  def hasLayer(layer:ILayer):Boolean = js.native
  def getLayer(id:String):ILayer = js.native
  def clearLayers():ILayer = js.native
  def eachLayer(fn:js.Function, context:js.Object = ???):LayerGroup = js.native
  def toGeoJSON():js.Object = js.native //TODO: Maybe make the return type some fixed GeoJSON type.
}
