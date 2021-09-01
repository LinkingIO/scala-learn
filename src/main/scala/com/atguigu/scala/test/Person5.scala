package com.atguigu.scala.test

class Person5(nameParam: String) {
  var name = nameParam
  var age: Int = _

  def this(nameParam: String, ageParam: Int){
    this(nameParam)  // this 表明对当前对象的引用
    this.age = ageParam
    println("父类辅助构造器")
  }

  println("父类主构造器")
}

class Emp(nameParam: String, ageParam: Int) extends Person5(nameParam, ageParam) {
  var empNo: Int = _
  def this(nameParam: String, ageParam: Int, empNoParam: Int) {
    this(nameParam, ageParam)
    this.empNo = empNoParam
    println("子类辅助函数构造器")
  }
  println("子类主函数构造器")
}

object Test {
  def main(args: Array[String]): Unit = {
    new Emp("zhangsan", 21, 110)
  }
}

