package com.atguigu.scala.myobject

class Person2 {
  // private只能在类的内部和伴生对象中可用
  private var name: String = "bobo"
  // protected 比Java中更严格，同类，子类可访问，同包不能访问
  protected var age: Int = 18
  // 在private私有属性中增加包的访问权限
  private[myobject] var sex: String = "男"

  def say() = {
    println(name)
  }
}

object Person2 {
  def main(args: Array[String]): Unit = {
    val person = new Person2
    person.say()
    println(person.name)
    println(person.age)
  }
}

class Teacher extends Person2 {
  def test() ={
    this.age = age
    this.sex = sex
  }
}

class Animal {
  def test = {
    new Person2().sex
  }
}
