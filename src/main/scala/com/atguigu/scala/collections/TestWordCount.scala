package com.atguigu.scala.collections

object TestWordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")

    val wordList = stringList.flatMap(_.split(" "))
    println(wordList)

    val wordToWordMap: Map[String, List[String]] = wordList.groupBy(word => word)
    println(wordToWordMap)

    // 获取Map单个kv键值对，作为tuple，统计
    val wordToCountMap = wordToWordMap.map(tuple => (tuple._1, tuple._2.size))
    println(wordToCountMap)

    val sortList = wordToCountMap.toList.sortWith {
      (left, right) => {
        left._2 > right._2
      }
    }

    val resultList = sortList.take(3)

    println(resultList)

  }
}
