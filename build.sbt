enablePlugins(ScalaJSPlugin)

name := "pamphlet"

version := "0.6-SNAPSHOT"

organization := "io.plasmap"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scmInfo := Some(ScmInfo(
  url("https://github.com/plasmap/pamphlet"),
  "scm:git:git@github.com/plasmap/pamphlet.git",
  Some("scm:git@github.com/plasmap/pamphlet.git")
))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deply/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>i-am-the-slime</id>
      <name>Mark Eibes</name>
      <url>https://github.com/i-am-the-slime/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }

scalaVersion := "2.11.6"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.lihaoyi"  %%% "utest" % "0.3.0" % "test"
)
