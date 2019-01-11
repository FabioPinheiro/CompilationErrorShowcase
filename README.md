# CompilationErrorShowcase
temporary repository to show a bug


# sbt
>compile
...
[error] /home/fabio/workspace/sbtbug/m/src/main/scala/fabio/ClientApp.scala:27:13: japgolly.scalajs.react.extra.router.Router[fabio.AppPage] does not take parameters
[error]       router().renderIntoDOM(dom.document.getElementById("root"))
[error]             ^



## TEST 1  the build.sbt
`lazy val root = (project in file("m"))`  give the error

If I rename:    m/src/main/scala/fabio/ClientApp.scala -> src/main/scala/fabio/ClientApp.scala
and change `lazy val root = (project in file("."))` it compiles fine


[info] Compiling 1 Scala source to /CompilationErrorShowcase/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 7 s, completed 11/jan/2019 2:30:29

## TEST  2 
If i use sbt.version=1.2.3 insate of sbt.version=1.2.{4,5,6,7,8}
It also compiles with no problem
