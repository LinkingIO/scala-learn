package day01

object AdvancedFunction {
  def main(args: Array[String]): Unit = {
    val f = foo
    println(f)

    // 相当于把函数foo当成一个整体，传递给变量f1
    val f1 = foo _
    f1()

    // 如果明确变量类型，不使用下划线也可以将函数作为整体传递给变量
    var f2: () => Int = foo
  }

  def foo(): Int = {
    println("foo...")
    2
  }

  // 函数参数作为签名

  def f3(f: (Int, Int) => Int): Int = {
    f(2, 4)
  }

  // 参数和f3输入值参数一致
  def add(a: Int, b: Int): Int = a + b

  // 调用，如果能推断不是调用，_可省略
  println("f3 函数调用")
  println(f3(add))

  def f4() = {
    def f5() = {

    }

    f5 _
  }

  val func = f4()

  f4()()
}
