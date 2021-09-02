package com.atguigu.scala.myobject

class Person6 {
  val name: String = "person" // 子类对抽象属性进行实现，父类抽象属性可用var修饰
  def hello(): Unit = {
    println("hello person")
  }
}

class Teacher6 extends Person6 {
  override val name: String = "teacher" // 非抽象方法的重写需要override修饰，重写抽象方法则可不加override
  override def hello()={
    println("hello Teacher")
  }
}

object Test6 {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher6()
    println(teacher.name)
    teacher.hello()

    val teacher1:Person6 = new Teacher6
    println(teacher1.name)
    teacher1.hello()
  }
}
