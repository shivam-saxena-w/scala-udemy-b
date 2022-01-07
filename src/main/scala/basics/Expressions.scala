package basics

object Expressions extends App {

  // every this is a Expression and not an Instruction
  // IF ELSE Expression

  val aInteger = 7
  val isEven = if (aInteger % 2 == 0) "yes" else "NO"
  println(isEven)

  val codeblock = {
    2>3
  }
  println(codeblock)

  val somevalue = {
    if ( codeblock) 12 else 13
    1
  }

  println(somevalue)

}
