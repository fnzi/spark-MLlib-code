package cn.tj.fnzi.scala

/** 函数 - 可变参数 */
object S004 {
  def main(args: Array[String]) {
    printStrings("Runoob", "Scala", "Python");
  }

  def printStrings(args: String*) = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }
}
