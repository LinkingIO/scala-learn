package com.atguigu.scala.collections

object TestList4 {
  def main(args: Array[String]): Unit = {
    val list = List(1, -7, 3, 4, 5)
    // 求和
    println(list.sum)

    // 求乘积
    println(list.product)

    // 最大值
    println(list.max)

    // 最小值
    println(list.min)

    // 按元素大小排序
    println(list.sortBy(x => x))

    // 按照绝对值大小排序
    println(list.sortBy(_.abs))

    // 按元素大小升序
    println(list.sortWith((x, y) => x < y))

  }
}
