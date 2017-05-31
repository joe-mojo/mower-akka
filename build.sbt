import sbt.Keys._

name := "mower-scala"

version := "1.0"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.18"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test" withSources(),
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion % "test",
  "junit" % "junit" % "4.8.1"
)

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"