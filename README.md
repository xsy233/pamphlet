# pamphlet
pamphlet is a leafletjs (http://leaflet.js.com) façade for ScalaJS.
It claims neither completeness nor correctness.

However, its focus lies on the latter.

1. [Getting pamphlet](#getting-it)
2. [Using pamphlet](#using-it)

<a name="getting-it"/>
## Getting pamphlet
First make sure that your `build.sbt` contains this line
```scala
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
```
Then add the dependency.
```scala
libraryDependencies += "io.plasmap" % "pamphlet" % "0.1-SNAPSHOT"
```

## Example
#### HTML (using Play here)
```html
<html>
  <head>
    <title>@title</title>
    <link rel="stylesheet" media="screen" href="@routes.Assets.at("stylesheets/leaflet.css")">
    <script src="@routes.Assets.at("scripts/leaflet.js")" type="text/javascript"></script>
  </head>
  <body>
    <div id="leafletmap"></div>
  </body>
</html>
```

#### ScalaJS
```scala
val cssId = "#leafletmap"
val conf = LeafletMapOptions.zoomControl(true).scrollWheelZoom(false).build
val leafletMap = Leaflet.map(cssId, conf).setView(scalajs.js.Array(51.505f, -0.09f), 13)
val Token = "your-token" //Make sure to replace this with your mapbox public token
val MapId = "examples.map-i86nkdio"
val Attribution = "Map data &copy; <a href=\"http://openstreetmap.org\">OpenStreetMap</a> contributors, <a href=\"http://creativecommons.org/licenses/by-sa/2.0/\">CC-BY-SA</a>, Imagery © <a href=\"http://mapbox.com\">Mapbox</a>"

val x = 51.198f
val y = 6.78f
val z = 14

val uri = s"https://{s}.tiles.mapbox.com/v4/$MapId/{z}/{x}/{y}.png?access_token=$Token"
val tileLayerOptions = TileLayerOptions
  .attribution(Attribution)
  .subdomains(scalajs.js.Array("a", "b", "c", "d"))
  .mapId(MapId)
  .token(Token)
  .detectRetina(true)
  .build

val tileLayer = Leaflet.tileLayer(uri, tileLayerOptions)
tileLayer.addTo(leafletMap)
leafletMap.setView(scalajs.js.Array(x,y), z)
```

#### plasmap

<p align="center">
[![plasmap](https://avatars3.githubusercontent.com/u/10074281?v=3&s=100)](http://www.plasmap.io)</br></br>

We develop *pamphlet* with **λ** at [**plasmap**](http://plasmap.io).
</p>
