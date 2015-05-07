package controllers.adminweb

import play.api.mvc.Controller
import scaldi.{Injectable, Injector}

class AdminAssets(implicit inj: Injector) extends Controller with Injectable {

    def at(path: String, file: String) = controllers.Assets.at(path, file)
}
