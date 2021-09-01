package day01

object TestFunction {

  // 方法可以重载和重写
  def main(): Unit = {
  }

  // 重载，函数名相同，参数个数不同
  def main(args: Array[String]): Unit = {
    // Scala 语言可在任何语法结构中声明任何语法结构
    import java.util.Date
    new Date()

    def test(): Unit = {
      println("无参数，进行返回！")
    }

    test()
    // 函数中没有重载的概念
    // 注： 重写，子类继承父类的方法，但改写方法体

    //    def test(ele: String): Unit = {
    //
    //    }

    def test2(): Unit = {
      def test3(): Unit = {
        println("进行嵌套返回！！！")
      }

      test3()
    }

    test2()


  }
}
