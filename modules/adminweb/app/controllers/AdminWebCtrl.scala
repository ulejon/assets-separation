package controllers.adminweb

import play.api.mvc.{Action, Controller}
import scaldi.{Injectable, Injector}

class AdminWebCtrl(implicit inj: Injector) extends Controller with Injectable {

     def index() = Action { implicit request =>
         Ok(views.html.adminindex())
     }
 }
