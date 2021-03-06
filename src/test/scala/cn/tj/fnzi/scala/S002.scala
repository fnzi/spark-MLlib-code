package cn.tj.fnzi.scala

/** 函数传名调用(Call-by-Name) */
object S002 {
  def main(args: Array[String]) {
    delayed(time());
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    // t
  }
}
