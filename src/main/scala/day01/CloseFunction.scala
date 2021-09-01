package day01

object CloseFunction {
  def main(args: Array[String]): Unit = {
    def f1() = {
      var a: Int = 2

      def f2(b: Int) = {
        a + b
      }

      f2 _
    }

    // 调用时，f1函数执行完毕之后a应该随着栈空间释放，但在此处a没有被释放，而是包含在f2函数内部，形成闭合效果
    val f = f1()
    println(f(3))

    println(f1()(3))

    // 函数柯里化，将复杂参数逻辑简单化，柯里化一定存在闭包
    def f3(a: Int)(b: Int) = a + b

    println(f3(2)(3))
  }
}
