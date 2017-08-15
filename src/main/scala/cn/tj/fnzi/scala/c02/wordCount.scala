package cn.tj.fnzi.scala.c02

import org.apache.spark.{SparkConf, SparkContext}
object wordCount {
  def main(args: Array[String]) {
    val conf = new SparkConf().setMaster("local").setAppName("wordCount")	//创建环境变量
    val sc = new SparkContext(conf)								//创建环境变量实例
    val data = sc.textFile("data/word-count-data.txt")								//读取文件
    data.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_+_).collect().foreach(println)	//word计数
  }
}
