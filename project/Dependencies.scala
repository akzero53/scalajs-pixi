import sbt._

/**
  * Library dependencies
  */
object Dependencies {
  import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

  val playVersion = "2.5.6"

  val scalaJsDom = Def.setting("org.scala-js" %%% "scalajs-dom" % "0.9.1")
  val scalaJsReact = Def.setting("com.github.japgolly.scalajs-react" %%% "core" % "0.11.2")

  val pixi = ProvidedJS / "pixi_v4.0.3.min.js"
  val scalaJsReactJsDeps = Seq(
    "org.webjars.bower" % "react" % "15.3.2"
      /        "react-with-addons.js"
      minified "react-with-addons.min.js"
      commonJSName "React",
    "org.webjars.bower" % "react" % "15.3.2"
      /         "react-dom.js"
      minified  "react-dom.min.js"
      dependsOn "react-with-addons.js"
      commonJSName "ReactDOM",
    "org.webjars.bower" % "react" % "15.3.2"
      /         "react-dom-server.js"
      minified  "react-dom-server.min.js"
      dependsOn "react-dom.js"
      commonJSName "ReactDOMServer")
}
