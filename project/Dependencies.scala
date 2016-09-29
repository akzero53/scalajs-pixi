import sbt._

/**
  * Library dependencies
  */
object Dependencies {
  import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

  val playVersion = "2.5.6"

  val scalaJsDom = Def.setting("org.scala-js" %%% "scalajs-dom" % "0.9.1")
  val pixi = ProvidedJS / "pixi_v4.0.3.min.js"
}
