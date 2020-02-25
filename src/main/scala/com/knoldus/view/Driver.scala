package com.knoldus.view

import com.knoldus.controller.{Rectangle, Square}
import com.knoldus.module.Shape
import com.knoldus.secondsolution

object Driver extends App {
  val rectangleObj: Shape = new Rectangle
val length=5
  val breadth=9
  val areaOfRectangle = rectangleObj.getArea(length, breadth)
  println("area of rectangle" + areaOfRectangle)
  val squareObj: Shape = new Square
  try {
    val side1=5
    val side2=4
    val areaOfSquare = squareObj.getArea(side1,side2)
    println("area of square" + areaOfSquare)
  }
  catch {
    case exception: Exception => println(exception.getMessage)
  }

}
