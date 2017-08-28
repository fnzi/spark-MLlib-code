package cn.tj.fnzi.scala

/**
  * http://twitter.github.io/scala_school/zh_cn/basics2.html
  **/
object S020 extends App {

  class Foo {}

  object FooMaker {
    def apply() = new Foo
  }

  val newFoo = FooMaker()
  println(newFoo)


  class Bar {
    def apply() = 0
  }

  val bar = new Bar

  println(bar)
  println(bar())

  object Timer {
    var count = 0

    def currentCount(): Long = {
      count += 1
      count
    }
  }

  println(Timer.currentCount())


  object addOne extends Function1[Int, Int] {
    def apply(m: Int): Int = m + 1
  }

  println(addOne(1))

  def addOne2 = { x: Integer => x + 1.2 }
  println(addOne2(2))

  val addOne3 = { x: Integer => x + 1.3 }
  println(addOne3(2))

  var addOne4 = { x: Integer => x + 1.4 }
  println(addOne4(2))
}
