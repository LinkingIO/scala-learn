package com.atguigu.scala.collections

object TestList3 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6)
    val list2 = List(3, 4, 5, 6, 7, 8)

    println(list1.head)
    println(list1.tail)

    println(list1.last)
    println(list1.init)

    println(list1.reverse)
    println(list1.take(3))
    println(list1.takeRight(3))

    println(list1.drop(3))
    println(list1.dropRight(3))

    println(list1.union(list2))

    println(list1.intersect(list2))

    println(list1.diff(list2))

    println(list1.zip(list2))

    list1.sliding(2, 5).foreach(println)
  }
}
