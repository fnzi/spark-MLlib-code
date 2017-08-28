package cn.tj.fnzi.scala

object S018 {
  def main(args: Array[String]) {
    val t = (4,3,2,1)

    t.productIterator.foreach{ i =>println("Value = " + i )}
  }
}
