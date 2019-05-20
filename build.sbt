name := """hello-play-assets"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val child = (project in file("./hello-play-assets-child"))
val root = (project in file(".")).enablePlugins(PlayJava).aggregate(child).dependsOn(child)

scalaVersion := "2.12.8"

libraryDependencies += guice
