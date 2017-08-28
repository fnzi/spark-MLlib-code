package cn.tj.fnzi.scala

object S016 {
  def main(args: Array[String]): Unit = {
    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)
    println("一维 : " + squares)

    println(squares.apply(2))

    // 创建二维列表
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)
  }
}
