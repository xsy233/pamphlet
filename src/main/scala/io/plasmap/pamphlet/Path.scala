package io.plasmap.pamphlet

import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

trait Path extends js.Object{
  def addTo(map:LeafletMap):Path = js.native
//  def bindPopup(html:String, options:LeafletPopupOptions = ???):Path = js.native
//  def bindPopup(el:HTMLElement, options:LeafletPopupOptions = ???):Path = js.native
  def bindPopup(popup:LeafletPopup, options:LeafletPopupOptions = ???):Path = js.native
  def unbindPopup():Path = js.native
  def openPopup(latlng:LeafletLatLng = ???):Path = js.native
  def closePopup():Path = js.native
  def setStyle(options:PathOptions):Path = js.native
  def getBounds():LatLngBounds = js.native
  def bringToFront():Path = js.native
  def bringToBack():Path = js.native
  def redraw():Path = js.native

  def SVG:Boolean = js.native
  def VML:Boolean = js.native
  def CANVAS:Boolean = js.native
  def CLIP_PADDING:Double = js.native
}

trait PathOptions extends js.Object
object PathOptions extends PathOptionBuilder(Map.empty[String, Any]) 
class PathOptionBuilder(val dict:Map[String, Any]) extends 
 JSOptionBuilder[PathOptions, PathOptionBuilder](new PathOptionBuilder(_)) {

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
