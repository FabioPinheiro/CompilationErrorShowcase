package fabio

import org.scalajs.dom


import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
sealed trait AppPage {
  def samePage(other: AppPage): Boolean = this.getClass == other.getClass
}

object Home extends AppPage


object ClientApp {

  import japgolly.scalajs.react.extra.router._

  val routerConfig = RouterConfigDsl[AppPage].buildConfig { dsl =>
    import dsl._
    (emptyRule).notFound(redirectToPage(Home)(Redirect.Replace))
  }

  def main(args: Array[String]): Unit = {
      val baseUrl = BaseUrl.until_# //val baseUrl = BaseUrl.fromWindowOrigin / "app"
      val router = Router(baseUrl, routerConfig)
      router().renderIntoDOM(dom.document.getElementById("root"))
  }
}
