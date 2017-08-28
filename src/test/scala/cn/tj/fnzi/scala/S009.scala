package cn.tj.fnzi.scala

/** 匿名函数 */
object S009 {
  def main(args: Array[String]) {
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor
}
