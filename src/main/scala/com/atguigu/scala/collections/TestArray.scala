package com.atguigu.scala.collections

object TestArray {
  def main(args: Array[String]): Unit = {
    val arrays = new Array[Int](10)
    println(arrays.length)
    arrays(2) = 2  //  小括号，取对应位置元素

    println(arrays.mkString(","))

    // 普通遍历

    for (i <- arrays) println( "普通遍历：" +i)

    // 简化遍历
    def printx(x: Int) ={
      println("简化遍历" + x)
    }

    arrays.foreach(printx)
    arrays.foreach(println(_))

    // 增加元素会怎样？
    // 会生成新的数组
    val ints:Array[Int] = arrays :+ 5

    println(ints.mkString(","))

  }
}
