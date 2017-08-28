package cn.tj.fnzi.scala

object S021 extends App {

  def f(s: String) = "f(" + s + ")"

  def g(s: String) = "g(" + s + ")"

  val fComposeG = f _ compose g _

  println(fComposeG("yay"))

  val fAndThenG = f _ andThen g _

  println(fAndThenG("yay"))
}
