package controllers.userweb

import play.api.mvc.Controller
import scaldi.{Injectable, Injector}

class UserAssets(implicit inj: Injector) extends Controller with Injectable {

    def at(path: String, file: String) = controllers.Assets.at(path, file)
}
