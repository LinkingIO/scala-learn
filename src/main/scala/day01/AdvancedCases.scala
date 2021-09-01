package day01

import scala.collection.mutable.ArrayBuffer

object AdvancedCases {
  def main(args: Array[String]): Unit = {
    /**
     * 知识点： 练习完成高阶function
     * 补充1：for中to为前后闭合，until 前闭后开
     * 补充2： 函数和方法的不同，为完成某一个功能的程序语句的集合，称为函数，在类中的函数称为方法
     * 补充3： 将遍历过程中处理的结果返回到一个新的Vector集合中，使用yield关键字
     *
     * @param arr
     * @param op
     * @return
     */
    // map
    def map(arr: Array[Int], op: Int => Int) = {
      for (ele <- arr) yield op(ele)
    }

    val arr = map(Array(1, 2, 3, 4), (x) => x * x)
    println("map::" + arr.mkString(","))

    // filter 过滤
    def filter(arr1: Array[Int], op: Int => Boolean) = {
      var arr2: ArrayBuffer[Int] = ArrayBuffer[Int]()
      for (ele <- arr1 if op(ele)) arr2.append(ele)
      arr2.toArray
    }

    val arr1: Array[Int] = filter(Array(1, 2, 3, 4), _ % 2 == 0)
    println("filter::" + arr1.mkString(","))

    // reduce 聚合
    def reduce(arr: Array[Int], op: (Int, Int) => Int) = {
      var result: Int = arr(0)
      for (ele <- 1 to arr.length)
        result = op(result, ele)
      result
    }

    val arr2: Int = reduce(Array(1, 2, 3, 4), _ * _)
    println("reduce::" + arr2)
  }
}
