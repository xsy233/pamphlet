package io.plasmap.pamphlet

import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

/**
 * Created by mark on 26.02.15.
 */
trait Circle extends ILayer {
  def addTo(map:LeafletMap):Circle = js.native
  def getLatLng():LeafletLatLng = js.native
  def setLatLng(latlng:LeafletLatLng):Circle = js.native
  def getRadius():Double = js.native
  def setRadius(radius:Double):Circle = js.native
  def toGeoJSON():js.Object = js.native
  def on(`type`:String, fn:js.Function1[LeafletEvents.LeafletEvent,Unit]):Circle = js.native
}

trait CircleOptions extends js.Object
object CircleOptions extends CircleOptionBuilder(Map.empty[String, Any])
class CircleOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[MarkerOptions, CircleOptionBuilder](new CircleOptionBuilder(_)) {

  def stroke(v:Boolean) = jsOpt("stroke", v)
  def color(v:String) = jsOpt("color", v)
  def weight(v:Int) = jsOpt("weight", v)
  def opacity(v:Double) = jsOpt("opacity", v)
  def fill(v:Boolean) = jsOpt("fill", v)
  def fillColor(v:String) = jsOpt("fillColor", v)
  def fillOpacity(v:Double) = jsOpt("fillOpacity", v)
  def fillRule(v:String) = jsOpt("fillRule", v)
  def dashArray(v:String) = jsOpt("dashArray", v)
  def lineCap(v:String) = jsOpt("lineCap", v)
  def lineJoin(v:String) = jsOpt("lineJoin", v)
  def clickable(v:Boolean) = jsOpt("clickable", v)
  def pointerEvents(v:String) = jsOpt("pointerEvents", v)
  def className(v:String) = jsOpt("className", v)
}
