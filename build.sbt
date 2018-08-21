
val libraries = Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "tapandpipe",
    version := "0.1",
    scalaVersion := "2.12.6",
    libraryDependencies ++= libraries,
  )
