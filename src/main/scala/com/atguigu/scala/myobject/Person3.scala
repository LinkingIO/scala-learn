package com.atguigu.scala.myobject

// 如主构造器无参数，小括号可以省略
class Person3 {

  var name: String = _
  var age: Int = _

  def this(age: Int) {
    this() // 辅助构造器不能直接构建对象，需要调用主构造方法
    this.age = age
    println("辅助构造器age")
  }

  // 允许有多个辅助构造器，通过参数列表来自动识别
  def this(age: Int, name: String) {
    this(age)  // 构造器调用其他构造器，要求被调用构造器提前申明
    this.name = name
    println("辅助构造器age，name")
  }
  println("主构造器")
}

object Person3 {
  def main(args: Array[String]): Unit = {
    val person = new Person3(18, "dingdang")
  }
}
