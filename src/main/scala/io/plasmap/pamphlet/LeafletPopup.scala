package io.plasmap.pamphlet

import io.plasmap.util.Helpers
import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

/**
 * Created by mark on 25.02.15.
 */
trait LeafletPopup extends js.Object{
  def addTo(map:LeafletMap):LeafletPopup = js.native
  def openOn(map:LeafletMap):LeafletPopup = js.native
  def setLatLng(latlng:LeafletLatLng):LeafletPopup = js.native
  def getLatLng():LeafletLatLng = js.native
  def setContent(content:String):LeafletPopup = js.native
  def getContent():String = js.native
  //TODO there are also HTMLElement versions of get and set content
  def update():LeafletPopup = js.native
}

trait LeafletPopupOptions extends js.Object
object LeafletPopupOptions extends LeafletPopupOptionBuilder(Map.empty[String, Any])
class LeafletPopupOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[LeafletPopupOptions, LeafletPopupOptionBuilder](new LeafletPopupOptionBuilder(_)) {

  def maxWidth(v: Int) = jsOpt("maxWidth", v)
  def minWidth(v: Int) = jsOpt("minWidth", v)
  def maxHeight(v: Int) = jsOpt("maxHeight", v)
  def autoPan(v: Boolean) = jsOpt("autoPan", v)
  def keepInView(v: Boolean) = jsOpt("keepInView", v)
  def closeButton(v: Boolean) = jsOpt("closeButton", v)
  def offset(v: LeafletPoint) = jsOpt("offset", v)
  def autoPanPaddingTopLeft(v: LeafletPoint) = jsOpt("autoPanPaddingTopLeft", v)
  def autoPanPaddingBottomRight(v: LeafletPoint) = jsOpt("autoPanPaddingBottomRight", v)
  def autoPanPadding(v: LeafletPoint) = jsOpt("autoPanPadding", v)
  def zoomAnimation(v: Boolean) = jsOpt("zoomAnimation", v)
  def closeOnClick(v: Boolean) = jsOpt("closeOnClick", v)
  def className(v: String) = jsOpt("className", v)
}
