package com.atguigu.scala.collections

import scala.collection.mutable

object TestQueue {
  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[String]()
    queue.enqueue("a", "b", "c")

    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
  }
}
