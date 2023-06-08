val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "url-shortener",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
  )
