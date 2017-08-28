package cn.tj.fnzi.scala

object S012 {
  def main(args: Array[String]) {
    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"
    println( "buf is : " + buf.toString );
  }
}
