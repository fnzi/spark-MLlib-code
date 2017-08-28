package cn.tj.fnzi.scala

import java.util.Date

/** 偏应用函数 */
object S010 {
  def main(args: Array[String]) {
    val date = new Date
    val logWithDateBound = log(date, _: String, _: Integer)

    var i = 1;

    logWithDateBound("message1", i)
    Thread.sleep(1000)
    i += 1
    logWithDateBound("message2", i)
    Thread.sleep(1000)
    i -= 1
    logWithDateBound("message3", i)
  }

  def log(date: Date, message: String, i: Integer) = {
    println(date + "----" + message + i)
  }
}
