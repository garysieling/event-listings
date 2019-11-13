

sealed trait Field
case object Event extends Field
case object Location extends Field
case object Time extends Field

sealed trait CoC
case object CoC1 extends CoC
case object CoC2 extends CoC

sealed trait EventStatus
case object Draft extends CoC
case object Public extends CoC

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
    status: EventStatus,
    comments: List[Comment]
)

case class User (
    id: String,
    email: String,
    name: String
)