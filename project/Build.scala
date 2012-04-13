import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  lazy val root = Project(id = "root", base = file(".")) aggregate(submodule, subplay)

  lazy val submodule = Project(id = "submodule", base = file("submodule"))

  lazy val subplay = PlayProject("subplay", path = file("subplay"), mainLang = SCALA).settings(
    // Add your own project settings here
  ) dependsOn(submodule)

}
