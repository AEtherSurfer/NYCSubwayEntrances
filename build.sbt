name := "MTA Stairs"

version := "1.0"

scalaVersion := "2.10.0"

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "0.7.0"

libraryDependencies += "com.google.code.gson" % "gson" % "2.2.2"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.5-RC2"

