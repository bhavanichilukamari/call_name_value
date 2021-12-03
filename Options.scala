object Options extends App{
 def get_string(num: Int): Option[String] ={
   if (num >=0) Some("A positive Number")
   else None
 }
  println(get_string(10))
 // nil : empty list
   val c = Nil
  println(c)

 /* def fun()= {
    throw new Exception // returns exception
  }
  fun()*/
    // Using yield with for
    var print = for( i <- 1 to 10) yield i
    for(j<-print)
    {
      // Printing result
      println(j)
    }
  def test(x:Int): String = x match {

    // if value of x is 0,
    // this case will be executed
    case 0 => "Hello"

    // if value of x is 1,
    // this case will be executed
    case 1 => "Scala"

    // if x doesnt match any sequence,
    // then this case will be executed
    case _ => "Spark"
  }
  println(test(1))
  def checkSign(x: Int): String = {
    x match {
      case a if a < 0 => s"$a is a negative number"
      case b if b > 0 => s"$b is a positive number"
      case c => s"$c neither positive nor negative"
    }
  }
  println(checkSign(19))
  // case class // no need to create instance
  case class Dog1(age: Int, name: String )
  val x =  Dog1(18,"oswald")
  val x3 =  Dog1(18,"oswald")
  val d2 = x.copy(age = 15)

  println(x == x3)
  println(d2)
}
