package cn.tj.fnzi.scala

/** 指定函数参数名 */
object S003 {
  def main(args: Array[String]) {
    printInt(b = 5, a = 7);
  }

  def printInt(a: Int, b: Int) = {
    println("Value of a : " + a);
    println("Value of b : " + b);
  }
}