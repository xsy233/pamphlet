package io.plasmap.pamphlet

import io.plasmap.util.Helpers.JSOptionBuilder

import scala.scalajs.js

/**
 * Created by mark on 26.02.15.
 */
trait Icon extends js.Object {

}

trait IconOptions extends js.Object
object IconOptions extends IconOptionBuilder(Map.empty[String, Any])
class IconOptionBuilder(val dict:Map[String, Any]) extends
 JSOptionBuilder[IconOptions, IconOptionBuilder](new IconOptionBuilder(_)) {

  def iconUrl(v:String) = jsOpt("iconUrl", v)
  def iconRetinaUrl(v:String) = jsOpt("iconRetinaUrl", v)
  def iconSize(v:LeafletPoint) = jsOpt("iconSize", v)
  def iconAnchor(v:LeafletPoint) = jsOpt("iconAnchor", v)
  def shadowUrl(v:String) = jsOpt("shadowUrl", v)
  def shadowRetinaUrl(v:String) = jsOpt("shadowRetinaUrl", v)
  def shadowSize(v:LeafletPoint) = jsOpt("shadowSize", v)
  def shadowAnchor(v:LeafletPoint) = jsOpt("shadowAnchor", v)
  def popupAnchor(v:LeafletPoint) = jsOpt("popupAnchor", v)
  def className(v:String) = jsOpt("className", v)
}
