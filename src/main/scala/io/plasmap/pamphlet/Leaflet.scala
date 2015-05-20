package io.plasmap.pamphlet

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by mark on 13.02.15.
 */
@JSName("L")
object Leaflet extends js.Object {
  def map(targetDivId:String, options:LeafletMapOptions):LeafletMap = js.native
  def point(x:Double, y:Double):LeafletPoint = js.native
  def tileLayer(url:String, tls:TileLayerOptions):TileLayer = js.native
  def layerGroup(layers:js.Array[ILayer] = ???):LayerGroup = js.native
  def featureGroup(layers:js.Array[ILayer] = ???):FeatureGroup = js.native
  def geoJson(geoJsonFeature:js.Object, options:GeoJsonLayerOptions):GeoJsonLayer = js.native
  def geoJson():GeoJsonLayer = js.native
  def latLngBounds(southWest:LeafletLatLng, northEast:LeafletLatLng):LatLngBounds = js.native
  def latLngBounds(latlngs:js.Array[LeafletLatLng]):LatLngBounds = js.native
  def icon(iconOptions:IconOptions):Icon = js.native
  def marker(latLng: LeafletLatLng, markerOptions:MarkerOptions = ???):Marker = js.native
  def latLng(lat:Double, lng:Double):LeafletLatLng = js.native
}

trait LeafletConfig extends scalajs.js.Object {
  val center:Array[Float] = scalajs.js.native
  val zoom:Float = scalajs.js.native
  val zoomControl:Boolean = scalajs.js.native
}

