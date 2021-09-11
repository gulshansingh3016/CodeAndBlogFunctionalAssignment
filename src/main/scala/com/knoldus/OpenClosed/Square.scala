package com.knoldus.OpenClosed

class Square(x: Int, y: Int, width: Int)
extends Rectangle(x, y, width, width){
  def area(width:Int) = {
    var c = width * width
    println(c)
  }
}
