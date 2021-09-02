package com.atguigu.scala.myobject

class Person8 private(cName: String){
  var name: String = cName
}

object Person8 {
  def apply(): Person8 = {
    print("apply 空参调用")
    new Person8("anonymous")
  }

  def apply(name: String): Person8 = {
    println("有参调用")
    new Person8(name)
  }
}

object Test8 {
  def main(args: Array[String]): Unit = {
    // 伴生对象apply方法，实现不用new创建对象
    val p1 = Person8()
    println("p1.name=" + p1.name)

    val p2 = Person8("lili")
    println("p2.name=" + p2.name)
  }
}
