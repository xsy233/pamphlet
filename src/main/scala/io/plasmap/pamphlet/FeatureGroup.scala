package io.plasmap.pamphlet

import scala.scalajs.js

/**
 * Created by mark on 26.02.15.
 */
trait FeatureGroup extends LayerGroup {
  def bindPopup(htmlContent:String, options:LeafletPopupOptions = ???):FeatureGroup = js.native
  def getBounds():LatLngBounds = js.native
  def setStyle(style:PathOptions):FeatureGroup = js.native
  def bringToFront():FeatureGroup = js.native
  def bringToBack():FeatureGroup = js.native
}
