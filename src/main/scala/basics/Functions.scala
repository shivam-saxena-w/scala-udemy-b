package basics

object Functions extends App {

  // def is a keyword used to create a function
  // no loops only recursion
  def recursiveFunction(message: String, times: Int): String ={
    if (times == 1) message
    else message + recursiveFunction(message, times-1)
  }
  println(recursiveFunction("Hello", 5))

  def nameAge(name:String, age:Int): String ={
    s"name is $name and age is $age"
  }
  println(nameAge("jabaz jadugar JJ", 30))

  def factorialCalc(number:Int): Int ={
    if (number <= 0) 1
    else number * factorialCalc(number-1)
  }
  println(factorialCalc(5))

  def fibonacciTill(num:Int):Int={
    if(num <= 2) 1
    else fibonacciTill(num - 1) + fibonacciTill(num - 2)

  }
  println(fibonacciTill(5))

   def isPrime(num: Int) : Boolean = {
   def primeUntil(t : Int) : Boolean ={
     if(num <= 1) true
     else num % 2 != 0 && primeUntil(t - 1)
   }

   primeUntil(num/2)
 }
 println(isPrime(3))

}

