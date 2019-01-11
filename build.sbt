import org.scalajs.core.tools.linker.ModuleInitializer

name := "sbt-react-test"

version := "0.1"

scalaVersion := "2.12.8"
val jdkVersion = "1.8"

lazy val M = (project in file("m"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" %  "0.9.6",

      "com.github.japgolly.scalajs-react" %%% "core" % "1.2.3",
      "com.github.japgolly.scalajs-react" %%% "extra" % "1.2.3"
    ),
  )
  .enablePlugins(ScalaJSPlugin)
