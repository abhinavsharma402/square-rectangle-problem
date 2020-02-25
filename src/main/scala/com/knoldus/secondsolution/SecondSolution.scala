package com.knoldus.secondsolution

class Rectangle {
    private def  getArea(length: Double, breadth: Double): Double = {
    length * breadth
  }
  def getRectangleArea():Double={
    val length=5
    val breadth=6
    getArea(length,breadth)
   }

}

class Square extends Rectangle {
  def getArea(length: Double, breadth: Double): Double = {

    if (length == breadth) {
      length * breadth
    }
    else {
      throw new Exception("sides must be equal for area of square")
    }
  }
}
object Driver extends App{
  val squareObj:Square=new Square
  println(squareObj.getArea(2,2))
  println(squareObj.getRectangleArea)
}


