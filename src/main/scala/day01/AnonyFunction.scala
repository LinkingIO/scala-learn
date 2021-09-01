package day01

object AnonyFunction {
  def main(args: Array[String]): Unit = {
    def operation(arr: Array[Int], op: Int => Int) = {
      for (ele <- arr) yield op(ele)
    }

    // 匿名函数
    val array1 = operation(Array(1, 3, 2, 4), (ele: Int) => ele + 1)
    println(array1.mkString(","))

    val array4 = operation(Array(1, 2, 4, 3), ele => ele + 1)
    println(array4.mkString(","))

    // 参数只出现一次，则参数可以省略且之后可以用_ 代替
    val array5 = operation(Array(1, 2, 4, 3), _ + 1)
    println(array5.mkString(","))

  }
}
