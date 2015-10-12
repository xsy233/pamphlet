package io.plasmap.pamphlet

import scala.scalajs.js

/**
 * Created by mark on 25.02.15.
 */
trait LatLngBounds extends js.Object {
  def extend(latLng:LeafletLatLng):LatLngBounds = js.native
  def extend(latLng:LatLngBounds):LatLngBounds = js.native
  def getSouthWest():LeafletLatLng = js.native
  def getNorthEast():LeafletLatLng = js.native
  def getNorthWest():LeafletLatLng = js.native
  def getSouthEast():LeafletLatLng = js.native
  def getWest():Double = js.native
  def getSouth():Double = js.native
  def getEast():Double = js.native
  def getNorth():Double = js.native
  def getCenter():LeafletLatLng = js.native
  def contains(latLngBounds: LatLngBounds):Boolean = js.native
  def contains(latLng:LeafletLatLng):Boolean = js.native
  def intersects(latLngBounds: LatLngBounds):Boolean = js.native
  def equals(latLngBounds: LatLngBounds):Boolean = js.native
  def pad(bufferRation:Double):LatLngBounds = js.native
  def isValid():Boolean = js.native
}
