package cn.tj.fnzi.scala

object S017 {
  def main(args: Array[String]) {
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // 交集
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.&~(num2) : " + num1.&~(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))
  }
}
