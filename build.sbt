name := """play-scala-seed"""
organization := "com.com.garysielincom.garysieling"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.com.garysielincom.garysieling.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.com.garysielincom.garysieling.binders._"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.3.2"
)

val enumeratumVersion = "1.5.13"

libraryDependencies ++= Seq(
    "com.beachape" %% "enumeratum" % enumeratumVersion
)

