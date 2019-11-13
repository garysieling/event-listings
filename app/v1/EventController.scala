package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.functional.syntax._
import play.api.libs.json.Reads._
import play.api.libs.json._

@Singleton
class EventController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  implicit val userReads = Json.reads[User]
  implicit val commentReads = Json.reads[Comment]
  implicit val eventReads = Json.reads[Event]

  implicit val userWrites = Json.writes[User]
  implicit val commentWrites = Json.writes[Comment]
  implicit val eventWrites = Json.writes[Event]

  def events() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def upcoming() = Action { implicit request: Request[AnyContent] =>
    val json = Json.toJson(List[Event](
        Event(
            "123",
            "www.google.com",
            "Scala",
            "Yeah some description",
            "Philadelphia, PA",
            "1:00 PM",
            77,
            List[User](),
            "Draft",
            List[Comment]()
        )
    ))
    Ok(json)
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
