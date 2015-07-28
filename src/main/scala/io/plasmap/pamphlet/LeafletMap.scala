package io.plasmap.pamphlet

import io.plasmap.pamphlet.LeafletEvents._
import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

trait LeafletMap extends js.Object {
  def setView(coordinates:js.Array[Float], zoomLevel:Int):LeafletMap = js.native
  def setZoom(level:Int):LeafletMap = js.native
  def getZoom():Int = js.native
  def fitBounds(bounds:LatLngBounds, options:FitBoundsOptions = ???):LeafletMap = js.native
  def addLayer(layer:ILayer):LeafletMap = js.native
  def removeLayer(layer:ILayer):LeafletMap = js.native
  def hasLayer(layer:ILayer):Boolean = js.native
  def click(me: LeafletMouseEvent) = js.native
  def doubleclick(me: LeafletMouseEvent) = js.native
  def mousedown(me: LeafletMouseEvent) = js.native
  def mouseup(me: LeafletMouseEvent) = js.native
  def mouseover(me: LeafletMouseEvent) = js.native
  def mouseout(me: LeafletMouseEvent) = js.native
  def mousemove(me: LeafletMouseEvent) = js.native
  def contextmenu(me: LeafletMouseEvent) = js.native
  def focus(e: LeafletEvent) = js.native
  def blur(e: LeafletEvent) = js.native
  def preclick(me: LeafletMouseEvent) = js.native
  def load(e: LeafletEvent) = js.native
  def unload(e:LeafletEvent) = js.native
  def viewreset(e:LeafletEvent) = js.native
  def movestart(e:LeafletEvent) = js.native
  def move(e:LeafletEvent) = js.native
  def moveend(e:LeafletEvent) = js.native
  def dragstart(e:LeafletEvent) = js.native
  def drag(e:LeafletEvent) = js.native
  def dragend(e:DragEndEvent) = js.native
  def zoomstart(e:LeafletEvent) = js.native
  def zoomend(e:LeafletEvent) = js.native
  def zoomlevelschange(e:LeafletEvent) = js.native
  def resize(e:ResizeEvent) = js.native
  def autopanstart(e:LeafletEvent) = js.native
  def layeradd(e:LayerEvent) = js.native
  def layerremove(e:LayerEvent) = js.native
  def baselayerchange(e:LayerEvent) = js.native
  def overlayadd(e:LayerEvent) = js.native
  def overlayremove(e:LayerEvent) = js.native
  def locationfound(e:LocationEvent) = js.native
  def locationerror(e:LeafletErrorEvent) = js.native
  def popupopen(e:PopupEvent) = js.native
  def popupclose(e:PopupEvent) = js.native
  def getPanes():MapPanes = js.native
  def on(eventName:String, fn:js.Any) = js.native
  def off(eventName:String, fn:js.Any) = js.native
  def clearAllEventListeners() = js.native
}

object LeafletMap {
  implicit class OnHandlers(val self: LeafletMap) extends AnyVal {
    def onClick      (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("click", cb)
    def onDoubleClick(cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("doubleclick", cb)
    def onMouseDown  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mousedown", cb)
    def onMouseUp    (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseup", cb)
    def onMouseOver  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseover", cb)
    def onMouseOut   (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mouseout", cb)
    def onMouseMove  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("mousemove", cb)
    def contextMenu  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.on("contextmenu", cb)

    def disableOnClick      (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("click", cb)
    def disableOnDoubleClick(cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("doubleclick", cb)
    def disableOnMouseDown  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mousedown", cb)
    def disableOnMouseUp    (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseup", cb)
    def disableOnMouseOver  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseover", cb)
    def disableOnMouseOut   (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mouseout", cb)
    def disableOnMouseMove  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("mousemove", cb)
    def disableContextMenu  (cb: LeafletMouseEvent ⇒ Unit): Unit = self.off("contextmenu", cb)
  }
}


trait FitBoundsOptions extends js.Object
object FitBoundsOptions extends FitBoundsOptionBuilder(Map.empty[String, Any])
class FitBoundsOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[FitBoundsOptions, FitBoundsOptionBuilder](new FitBoundsOptionBuilder(_)) {

  def paddingTopLeft(v:LeafletPoint) = jsOpt("paddingTopLeft", v)
  def paddingBottomRight(v:LeafletPoint) = jsOpt("paddingBottomRight", v)
  def padding(v:LeafletPoint) = jsOpt("padding", v)
  def maxZoom(v:Int) = jsOpt("maxZoom", v)
}

trait LeafletMapOptions extends js.Object
object LeafletMapOptions extends LeafletMapOptionBuilder(Map.empty[String, Any]) 
class LeafletMapOptionBuilder(val dict:Map[String, Any]) extends 
 JSOptionBuilder[LeafletMapOptions, LeafletMapOptionBuilder](new LeafletMapOptionBuilder(_)) {

  def zoom(v: Int) = jsOpt("zoom", v)
  def minZoom(v: Int) = jsOpt("minZoom", v)
  def maxZoom(v: Int) = jsOpt("maxZoom", v)
  def dragging(v: Boolean) = jsOpt("dragging", v)
  def touchZoom(v: Boolean) = jsOpt("touchZoom", v)
  def scrollWheelZoom(v: Boolean) = jsOpt("scrollWheelZoom", v)
  def doubleClickZoom(v: Boolean) = jsOpt("doubleClickZoom", v)
  def boxZoom(v: Boolean) = jsOpt("boxZoom", v)
  def tap(v: Boolean) = jsOpt("tap", v)
  def tapTolerance(v: Int) = jsOpt("tapTolerance", v)
  def trackResize(v: Boolean) = jsOpt("trackResize", v)
  def worldCopyJump(v: Boolean) = jsOpt("worldCopyJump", v)
  def closePopupOnClick(v: Boolean) = jsOpt("closePopupOnClick", v)
  def bounceAtZoomLimits(v: Boolean) = jsOpt("bounceAtZoomLimits", v)
  def keyboard(v: Boolean) = jsOpt("keyboard", v)
  def keyboardPanOffset(v: Int) = jsOpt("keyboardPanOffset", v)
  def keyboardZoomOffset(v: Int) = jsOpt("keyboardZoomOffset", v)
  def inertia(v: Boolean) = jsOpt("inertia", v)
  def inertiaDeceleration(v: Int) = jsOpt("inertiaDeceleration", v)
  def inertiaMaxSpeed(v: Int) = jsOpt("inertiaMaxSpeed", v)
  def inertiaThreshold(v: Int) = jsOpt("inertiaThreshold", v)
  def zoomControl(v: Boolean) = jsOpt("zoomControl", v)
  def attributionControl(v: Boolean) = jsOpt("attributionControl", v)
  def fadeAnimation(v: Boolean) = jsOpt("fadeAnimation", v)
  def zoomAnimation(v: Boolean) = jsOpt("zoomAnimation", v)
  def zoomAnimationThreshold(v: Int) = jsOpt("zoomAnimationThreshold", v)
  def markerZoomAnimation(v: Boolean) = jsOpt("markerZoomAnimation", v)
}
