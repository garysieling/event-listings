package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class EventController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def events() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def upcoming() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def near() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }


  def notifyAttendees() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def rsvp() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def unrsvp() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def messages() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def message() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
