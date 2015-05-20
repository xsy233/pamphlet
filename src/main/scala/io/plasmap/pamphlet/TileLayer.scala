package io.plasmap.pamphlet

import io.plasmap.pamphlet.LeafletEvents.{LeafletEvent, TileEvent}
import io.plasmap.util.Helpers.JSOptionBuilder
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.Array

/**
 * Created by mark on 25.02.15.
 */

trait TileLayer extends ILayer {
  def addTo(leafletMap:LeafletMap):TileLayer = js.native
  def bringToFront():TileLayer = js.native
  def bringToBack():TileLayer = js.native
  def setOpacity(opacity:Double):TileLayer = js.native
  def setZIndex(zIndex:Double):TileLayer = js.native
  def redraw():TileLayer = js.native
  def setUrl(urlTemplate:String) = js.native
  def getContainer():HTMLElement = js.native
  private def on(eventName:String,  eventHandler:js.Function1[TileEvent, Unit]) = js.native
  def onLoading(handler:Function1[LeafletEvent, Unit]) = on("loading", handler)
  def onLoad(handler:Function1[LeafletEvent, Unit]) = on("load", handler)
  def onTileLoadStart(handler:Function1[TileEvent, Unit]) = on("tileloadstart", handler)
  def onTileLoad(handler:Function1[TileEvent, Unit]) = on("tileload", handler)
  def onTileUnload(handler:Function1[TileEvent, Unit]) = on("tileunload", handler)
}

trait TileLayerOptions extends js.Object
object TileLayerOptions extends TileLayerOptionBuilder(Map.empty[String, Any])
class TileLayerOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[TileLayerOptions, TileLayerOptionBuilder](new TileLayerOptionBuilder(_)) {

  def minZoom(v: Int) = jsOpt("minZoom", v)
  def maxZoom(v: Int) = jsOpt("maxZoom", v)
  def maxNativeZoom(v: Int) = jsOpt("maxNativeZoom", v)
  def tileSize(v: Int) = jsOpt("tileSize", v)
  def subdomains(v: String) = jsOpt("subdomains", v)
  def subdomains(v: Array[String]) = jsOpt("subdomains", v)
  def errorTileUrl(v: String) = jsOpt("errorTileUrl", v)
  def attribution(v: String) = jsOpt("attribution", v)
  def tms(v: Boolean) = jsOpt("tms", v)
  def continuousWorld(v: Boolean) = jsOpt("continuousWorld", v)
  def noWrap(v: Boolean) = jsOpt("noWrap", v)
  def zoomOffset(v: Int) = jsOpt("zoomOffset", v)
  def zoomReverse(v: Boolean) = jsOpt("zoomReverse", v)
  def opacity(v: Double) = jsOpt("opacity", v)
  def zIndex(v: Int) = jsOpt("zIndex", v)
  def unloadInvisibleTiles(v: Boolean) = jsOpt("unloadInvisibleTiles", v)
  def updateWhenIdle(v: Boolean) = jsOpt("updateWhenIdle", v)
  def detectRetina(v: Boolean) = jsOpt("detectRetina", v)
  def reuseTiles(v: Boolean) = jsOpt("reuseTiles", v)
  def bounds(v:LatLngBounds) = jsOpt("bounds", v)
  def mapId(v:String) = jsOpt("mapId", v)
  def token(v:String) = jsOpt("token", v)

}
