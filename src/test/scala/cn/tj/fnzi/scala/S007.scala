package cn.tj.fnzi.scala

/** 高阶函数 */
object S007 {
  def main(args: Array[String]) {

    println(apply1(layout, 10))

  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply1(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

}
