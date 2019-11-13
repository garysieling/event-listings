package controllers
import enumeratum._

sealed trait Field extends EnumEntry
object Field extends Enum[Field] {
  val values = findValues

  case object Event extends Field
  case object Location extends Field
  case object Time extends Field
}

sealed trait CoC extends EnumEntry
object CoC extends Enum[CoC] {
  val values = findValues

  case object CoC1 extends CoC
  case object CoC2 extends CoC
}

sealed trait EventStatus extends EnumEntry
object EventStatus extends Enum[EventStatus] {
  val values = findValues

  case object Draft extends EventStatus
  case object Public extends EventStatus
}

case class Group(
  id: String,
  link: String,
  title: String,
  description: String,
  organizers: List[User],
  limitedFields: List[Field],
  coc: CoC
)

case class Comment(
    by: User,
    text: String,
    timestamp: String
)

case class Event(
    id: String,
    link: String,
    title: String,
    description: String,
    location: String,
    time: String,
    maxAttendees: Int,
    attendees: List[User],
    status: String,
    comments: List[Comment]
)

case class User (
    id: String,
    email: String,
    name: String
)

