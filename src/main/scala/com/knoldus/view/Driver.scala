package com.knoldus.view

import com.knoldus.controller.{Rectangle, Square}
import com.knoldus.module.Shape

object Driver extends App{
  val rectangleObj:Shape=new Rectangle

  val areaOfRectangle=rectangleObj.getArea(2,5)
  println("area of rectangle"+areaOfRectangle)
  val squareObj:Shape=new Square
  try {
    val areaOfSquare = squareObj.getArea(2, 5)
    println("area of square"+areaOfSquare)
  }
  catch{
    case exception: Exception=>println(exception.getMessage)
  }
}
