package controllers

import play.api._
import play.api.mvc._
import models.Task
import play.api.data._
import play.api.data.Forms._


object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.tasks)
  }

  def tasks = Action {
    Ok(views.html.index(Task.all(), taskForm))
  }

  def newTask = TODO

  def deleteTask(id: Long) = TODO

  val taskForm = Form(
    "label" -> nonEmptyText
  )

}
