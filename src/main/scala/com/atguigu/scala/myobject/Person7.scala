package com.atguigu.scala.myobject

class Person7 {
  var name: String = "bobo"
}

object Person7 {
  var country: String = "China"
}

object Test7 {
  def main(args: Array[String]): Unit = {
    println(Person7.country)
  }
}
