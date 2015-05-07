name := "assets-separation"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = project.in(file("."))
        .aggregate(userWeb, adminWeb)
        .settings(scalaVersion := "2.11.6")

lazy val userWeb = project.in(file("modules/userweb") ).
        enablePlugins(PlayScala).
        dependsOn(adminWeb).
        settings(
            scalaVersion := "2.11.6",
            libraryDependencies += "org.scaldi" %% "scaldi-play" % "0.5-play-2.4.0-RC1-9"
        )

lazy val adminWeb = project.in(file("modules/adminweb")).
        enablePlugins(PlayScala).
        settings(
            scalaVersion := "2.11.6",
            libraryDependencies += "org.scaldi" %% "scaldi-play" % "0.5-play-2.4.0-RC1-9"
        )