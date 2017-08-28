package cn.tj.fnzi.scala

object S019 {
  def main(args: Array[String]) {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("sites.get( \"runoob\" ) : " + sites.get("runoob").get) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " + sites.get("baidu")) //  None

    println(sites.get("baidu") == None)
//    println(sites.get("baidu").get)


    println("show(sites.get( \"runoob\")) : " +
      show(sites.get( "runoob")) )
    println("show(sites.get( \"baidu\")) : " +
      show(sites.get( "baidu")) )
  }


  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
}
