package com.atguigu.scala.collections

import scala.collection.mutable.ListBuffer

object TestListBuffer {
  def main(args: Array[String]): Unit = {
    val lb = ListBuffer(1, 2, 3, 4)
    lb.+=(5)
    lb.append(6)
    lb.insert(1,1,2,2)  // 指定位置插入元素
    lb.update(1,7)
    println(lb.mkString(","))

    // 删除元素
    lb.-(5)
    lb.-=(5)

    println(lb.mkString(","))
  }
}
