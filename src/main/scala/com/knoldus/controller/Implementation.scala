package com.knoldus.controller

import com.knoldus.module.Shape

/**
 * Reactangle class calculate area of rectangle
 */

class Rectangle extends Shape{
  /**
   *
   * @param length take length
   * @param breadth take breadth
   * @return area
   */
  override def getArea(length: Double, breadth: Double): Double = {
    length*breadth
  }


}

/**
 * Square class calculate area of square
 */
class Square extends Shape{
  /**
   *
   * @param length take length
   * @param breadth take breadth
   * @return area
   */

  override def getArea(length: Double, breadth: Double): Double = {
    if(length==breadth){
    length*breadth
  }
    else {
    throw new Exception("sides must be equal for area of square")
    }
  }
}
