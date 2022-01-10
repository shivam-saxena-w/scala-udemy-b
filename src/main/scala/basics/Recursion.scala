package basics

import scala.annotation.tailrec

object Recursion extends App {

  // factorial using recursion
  def fact(num : Int):Int=
    if (num == 1) 1
    else {
      println(s"for $num i want " + (num - 1) )
      val res = num * fact(num - 1)
      println(s"factorial of $num is")
      res
    }

  def factorialOf(number: Int):Int= {
    def factHelper(num: Int, acc: Int): Int =
      if (num <= 1) acc
      else factHelper (num - 1, num * acc)

    factHelper(number, 1)
  }




}
