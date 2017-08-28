package cn.tj.fnzi.scala

object S015 {
  def main(args : Array[String]): Unit = {
    val site = ("Google" :: ("Baidu" :: Nil)).::("Runoob")

    print(site)
    val nums = Nil

    println( "第一网站是 : " + site.head )
    println( "最后一个网站是 : " + site.tail )
    println( "查看列表 site 是否为空 : " + site.isEmpty )
    println( "查看 nums 是否为空 : " + nums.isEmpty )

    print(nums)
  }

}
