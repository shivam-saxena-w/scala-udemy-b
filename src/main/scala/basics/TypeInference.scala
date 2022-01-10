package basics

object TypeInference extends App {

  val numOne: Int = 1
  val newNumberTwo = 2
  val msg = "this is a message"
  val newMsg = msg + numOne // add -> String (String + Integer)
  println(newMsg)
  // you see we are not specifying any type here still compiler won't throw error
  // scala will take the type of the function automatically, but it should be correct as per right hand side.
  def sqare (x: Int) = x * x
  println(sqare(2))

  // in case of a recursive functions we need to specify the type (IMPORTANT)


}
