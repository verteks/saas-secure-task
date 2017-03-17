name := """saas-secure-task"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.webjars" % "bootstrap" % "3.3.5",
  "org.webjars" % "jquery" % "2.1.1"
)
