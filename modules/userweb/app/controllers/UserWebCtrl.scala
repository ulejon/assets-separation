package controllers.userweb

import play.api.mvc.{Action, Controller}
import scaldi.{Injectable, Injector}

class UserWebCtrl(implicit inj: Injector) extends Controller with Injectable {

    def index() = Action { implicit request =>
        Ok(views.html.userindex())
    }
}
