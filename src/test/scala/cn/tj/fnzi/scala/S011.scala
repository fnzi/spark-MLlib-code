package cn.tj.fnzi.scala

/**
  * 函数柯里化
  */
object S011 {
  def main(args: Array[String]) {
    val str1: String = "Hello, "
    val str2: String = "Scala!"
    println("str1 + str2 = " + strcat(str1)(str2))
  }

  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}
