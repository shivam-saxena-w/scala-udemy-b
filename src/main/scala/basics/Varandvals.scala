package basics

object Varandvals extends App {


  val constant /* val keyword is === const named constant */ : Int /*here is the type of data it'll store ie an integer*/ = 12

  val aCondition : Boolean = true
  val adultCondition: String = if(aCondition) "18+" else "minor"
  println(adultCondition)
  
}
