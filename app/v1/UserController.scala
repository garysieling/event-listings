package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def view() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def history() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
