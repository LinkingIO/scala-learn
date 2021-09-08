package com.atguigu.scala.collections

object TestList2 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 5, 5)
    // 集合长度
    println(list.length)

    // 循环遍历
    println("foreach--------")
    list.foreach(println)
    println("list-----------")
    for (elem <- list) {println(elem)}

    // 迭代器
    println("list iterator---------")
    for (elem <- list.iterator) {
      println(elem)
    }

    // 生成字符串
    println(list.mkString(","))

    // 是否包含
    println(list.contains(3))
  }
}
