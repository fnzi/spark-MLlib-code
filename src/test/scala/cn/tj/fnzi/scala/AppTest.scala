package cn.tj.fnzi.scala

import org.junit._
import Assert._

@Test
class AppTest {

  @Test
  def testOK() = assertTrue(true)

  //    @Test
  //    def testKO() = assertTrue(false)

  @Test
  def testImmutable() = {
    val px = new Person("fnzi")

    var x = List(px)


    var p = new Person("1")

    var z = x :+ p

    //    p.setName("sss");

    var a = List(new Aa())

    x.foreach(x => println(x.name))
    println()
    z.foreach(x => println(x.name))
    println()
    a.foreach(x => println(x.getName()))

  }

  //  class Person(nm: String) {
  //    var name = nm
  //  }

  class Person(nm: String) {
    val name = nm
  }


  def quickSort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) xs
    else {
      println(xs.head)
      println(xs)
      //      quickSort(xs.filter(x => x < xs.head)) ::: xs.head :: quickSort(xs.filter(x => x > xs.head))

      (quickSort(xs.filter(x => x < xs.head)) :+ xs.head) ::: quickSort(xs.filter(x => x > xs.head))
    }
  }

  @Test
  def quickSortTest() = {
    val l = List(5, 6, 2, 4, 8, 7)

    val r = quickSort(l);
    print(r)
  }


  @Test
  def cal() = {
    val r = 2 * 4 + 5

    print(r)
  }
}


