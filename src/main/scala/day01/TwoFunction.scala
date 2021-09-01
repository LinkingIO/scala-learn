package day01

class TwoFunction {
  def main(args: Array[String]): Unit = {

    def calculator(a: Int, b: Int, op: (Int, Int) => Int): Int = {
      op(a, b)
    }

    // 标准处理
    println(calculator(2, 3, (x: Int, y: Int) => {x + y}))

    // 参数类型可以省略，会根据形参进行自动推导
    println(calculator(2, 3, (x, y ) => x + y))

    // 参数只出现一次，则可以省略
    println(calculator(2, 3, _ + _))
  }
}
