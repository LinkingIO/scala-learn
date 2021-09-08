package com.atguigu.scala.collections

object TestMap {
  def main(args: Array[String]): Unit = {
    // 创建不可变集合Map
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)

    // 访问数据
    for (ele <- map.keys){
      // Map的get方法，会返回特殊类型Option: 有值Some，无值None
      println(ele + "=" + map.get(ele).get)
    }
    println(map.get("a").get)

    // 根据key找到value，如果不存在，返回默认值
    println(map.getOrElse("d", -1))

    // 循环打印
    map.foreach(println)
  }
}
