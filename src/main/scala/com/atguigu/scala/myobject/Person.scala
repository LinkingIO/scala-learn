package com.atguigu.scala.myobject

import scala.beans.BeanProperty

class Person {
  var name: String = "bobo"
  var age: Int = _

  @BeanProperty var sex: String = "男"
}

object Person {
  def main(args: Array[String]): Unit = {
    val person = new Person
    
    println(person.name)
    println(person.age)

    person.setSex("女")
    println(person.getSex)
  }
}
