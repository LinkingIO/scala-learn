package com.atguigu.scala.myobject

trait PersonTrait {
  var name: String = _
  var age: Int

  def eat() = {
    println("eat")
  }
  def say(): Unit
}

trait SexTrait {
  var sex: String
}

class Teacher2 extends PersonTrait with java.io.Serializable {
  override var age: Int = _

  override def say(): Unit = {
    println("say")
  }
}

object TestTrait {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher2
    teacher.say()
    teacher.eat()

    // 动态混入：可灵活扩展类的功能
    val teacher2 = new Teacher2 with SexTrait {
      override var sex: String = "男"
    }

    println(teacher2.sex)
  }
}
