package io.plasmap.pamphlet

import org.scalajs.dom.raw.{HTMLElement, MouseEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by mark on 25.02.15.
 */
object LeafletEvents {

  trait LeafletEvent extends js.Object {
    @JSName("type")
    val typ:String
    val target:js.Object
  }

   trait DragEndEvent extends LeafletEvent {
     val distance:Int
   }

  trait TileEvent extends LeafletEvent {
    val tile:HTMLElement
    val url:String
  }

  trait LeafletMouseEvent extends LeafletEvent {
    val latlng:LeafletLatLng
    val layerPoint:LeafletPoint
    val containerPoint:LeafletPoint
    val originalEvent:MouseEvent
  }

  trait LeafletErrorEvent extends LeafletEvent {
    val message:String
    val code:Int
  }

  trait LayerEvent extends LeafletEvent {
    val layer:ILayer
  }

  trait LayersControlEvent extends LeafletEvent {
    val layer:ILayer
    val name:String
  }

  trait ResizeEvent extends LeafletEvent {
    val oldSize:LeafletPoint
    val newSize:LeafletPoint
  }

  trait GeoJsonEvent extends LeafletEvent {
    val layer:ILayer
    val properties:js.Object
    val geometryType:String
    val id:String
  }

  trait PopupEvent extends LeafletEvent {
    val popup:LeafletPopup
  }

  trait LocationEvent extends LeafletEvent {
    val latlng:LeafletLatLng
    val bounds:LatLngBounds
    val accuracy:Double
    val altitude:Double
    val altitudeAccuracy:Double
    val heading:Double
    val speed:Double
    val timestamp:Double
  }

}
