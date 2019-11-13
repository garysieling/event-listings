package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class GroupController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def groups() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def notifyMembers() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def messages() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def message() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def join() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def leave() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
