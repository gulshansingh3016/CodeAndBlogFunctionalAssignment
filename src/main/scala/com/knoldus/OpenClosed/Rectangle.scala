package com.knoldus.OpenClosed


class Rectangle(x: Int, y: Int, val width: Int, val height: Int)
  extends Shape(x, y)
{
  var area= width * height
  println(area)
}
