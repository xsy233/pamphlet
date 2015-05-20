package io.plasmap.pamphlet

import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

/**
 * Created by mark on 26.02.15.
 */
trait Marker extends ILayer {
  def addTo(map:LeafletMap):Marker = js.native
  def getLatLng():LeafletLatLng = js.native
  def setLatLng(latlng:LeafletLatLng):Marker = js.native
  def setIcon(icon:Icon):Marker = js.native
  def setZIndexOffset(offset:Int):Marker = js.native
  def setOpacity(opacity:Double):Marker = js.native
  def update():Marker = js.native
  def bindPopup(html:String, popupOptions:LeafletPopupOptions = ???):Marker = js.native
  def unbindPopup():Marker = js.native
  def openPopup():Marker = js.native
  def getPopup():LeafletPopup = js.native
  def closePopup():Marker = js.native
  def togglePopup():Marker = js.native
  def toGeoJSON():js.Object = js.native
  def on(`type`:String, fn:js.Function1[LeafletEvents.LeafletEvent,Unit]):Marker = js.native
}

trait MarkerOptions extends js.Object
object MarkerOptions extends MarkerOptionBuilder(Map.empty[String, Any])
class MarkerOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[MarkerOptions, MarkerOptionBuilder](new MarkerOptionBuilder(_)) {

  def icon(v:Icon) = jsOpt("icon", v)
  def clickable(v:Boolean) = jsOpt("clickable", v)
  def draggable(v:Boolean) = jsOpt("draggable", v)
  def keyboard(v:Boolean) = jsOpt("keyboard", v)
  def title(v:String) = jsOpt("title", v)
  def alt(v:String) = jsOpt("alt", v)
  def zIndexOffset(v:Int) = jsOpt("zIndexOffset", v)
  def opacity(v:Double) = jsOpt("opacity", v)
  def riseOnHover(v:Boolean) = jsOpt("riseOnHover", v)
  def riseOffset(v:Int) = jsOpt("riseOffset", v)
}
