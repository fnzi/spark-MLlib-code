package cn.tj.fnzi.scala

/** 默认参数值 */
object S006 {
  def main(args: Array[String]) {
    println("返回值 : " + addInt());
    println("返回值 : " + addInt(3));
    println("返回值 : " + addInt(b = 3));
  }

  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}
