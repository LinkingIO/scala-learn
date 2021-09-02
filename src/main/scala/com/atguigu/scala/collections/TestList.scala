package com.atguigu.scala.collections

object TestList {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 4, 3)  // 数据有序，可重复
    val nullList = 1::2::3::4::5::Nil // 通过Nil识别为List

    println(ints)
    println(nullList)

    // ::的运算规则从右往左，则是一直添加第一位置的元素
    val list1 = 7::6::5::ints
    println(list1.mkString(","))

    // 集合间合并: 将一个整体拆成一个个的个体，称为扁平化
    val list3 = List(8, 9)
    val list4 = list3:::list1
    println(list4)
  }
}
