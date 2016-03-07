name := "kiwi-java"

version := "0.0.1-SNAPSHOT"

crossPaths := false

autoScalaLibrary := false

//testOnly -- -v "no.birkett.kiwi.Tests.simpleNew"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)
