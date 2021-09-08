package com.atguigu.scala.collections

import scala.collection.mutable

object TestSet {
  def main(args: Array[String]): Unit = {
    // 不可变集合，数据无序
    val set = Set(1, 2, 3, 3)
    println(set.mkString(","))

    // 可变集合
    val set1 = mutable.Set(1, 2, 3, 3)

    // 增加元素
    set1 += 8
    println(set1.mkString(","))

    // 删除元素
    set1 -= 2
    println(set1.mkString(","))

  }
}
