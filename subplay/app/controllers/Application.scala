package controllers

import play.api._
import play.api.mvc._

import jp.t2v.lab.play20.sample._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(TestModule()))
  }
  
}