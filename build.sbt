lazy val scalaV = "2.12.4"
lazy val libV = "0.1.0-SNAPSHOT"

lazy val sharedSettings = Seq(
  organization  := "io.github.node4s",
  scalaVersion  := scalaV,
  version       := libV,
  scalacOptions in Compile += "-P:scalajs:sjsDefinedByDefault",
  libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
)

lazy val core = (project in file("axel-core"))
  .enablePlugins(ScalaJSPlugin)
  .settings(sharedSettings)
  .settings(
    name := "axel-core",
    scalaJSLinkerConfig ~= {
      _.withSourceMap(false)
    }
  )

lazy val nodejs = project.in(file("axel-nodejs"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(core)
  .settings(
    name := "axel-nodejs"
  )