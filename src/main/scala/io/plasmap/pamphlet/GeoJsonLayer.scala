package io.plasmap.pamphlet

import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

trait GeoJsonLayerOptions extends scalajs.js.Object
object GeoJsonLayerOptions extends GeoJsonOptionBuilder(Map.empty[String, Any])
class GeoJsonOptionBuilder(val dict:Map[String, Any]) extends
  JSOptionBuilder[GeoJsonLayerOptions, GeoJsonOptionBuilder](new GeoJsonOptionBuilder(_)) {

  def pointToLayer(v:js.Function2[js.Object, LeafletLatLng, ILayer]) = jsOpt("pointToLayer", v)
  def style(v:js.Function1[js.Object, Unit]) = jsOpt("style", v)
  def onEachFeature(v:js.Function2[js.Object, ILayer, Unit]) = jsOpt("onEachFeature", v)
  def filter(v:js.Function2[js.Object, ILayer, Unit]) = jsOpt("filter", v)
//  def coordsToLatLng(v:js.Function1[js.Array, ]) = jsOpt("coordsToLatLng", v)  //TODO: Understand this

  //From Path:
  def stroke(v:Boolean) = jsOpt("stroke", v)
  def color(v:String) = jsOpt("color", v)
  def weight(v:Int) = jsOpt("weight", v)
  def opacity(v:Double) = jsOpt("opacity", v)
  def fill(v:Boolean) = jsOpt("fill", v)
  def fillColor(v:String) = jsOpt("fillColor", v)
  def fillOpacity(v:Double) = jsOpt("fillOpacity", v)
  def dashArray(v:String) = jsOpt("dashArray", v)
  def lineCap(v:String) = jsOpt("lineCap", v)
  def lineJoin(v:String) = jsOpt("lineJoin", v)
  def clickable(v:Boolean) = jsOpt("clickable", v)
  def pointerEvents(v:String) = jsOpt("pointerEvents", v)
  def className(v:String) = jsOpt("className", v)
}

trait GeoJsonLayer extends FeatureGroup {
  def addData(geoJson:js.Object):GeoJsonLayer = js.native  //TODO: Make this take GeoJSON
  def setStyle(fn:js.Function1[js.Object, Unit]):GeoJsonLayer = js.native
  def resetStyle(layer:Path):GeoJsonLayer = js.native
}
