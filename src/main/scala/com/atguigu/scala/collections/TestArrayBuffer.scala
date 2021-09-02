package com.atguigu.scala.collections

import scala.collection.mutable.ArrayBuffer

object TestArrayBuffer {
  def main(args: Array[String]): Unit = {
    val ab = ArrayBuffer[Any](1, 2, 4)
    println(ab.mkString(","))

    println("ab.hash=" + ab.hashCode())

    ab.append(5, 6)
    ab.insert(0, 7,1)
    println(ab.mkString(","))
  }
}
