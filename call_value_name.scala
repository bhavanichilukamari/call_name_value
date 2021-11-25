object call_value_name extends App {
  def ArticleCounts(i: => Int) //call by name
  {
    println("Tanya did articles " +
      " on day one is 1 - Total = " + i)
    println("Tanya did articles "+
      "on day two is 1 - Total = " + i)
  }
  var Total = 0;

  // calling function
  ArticleCounts
  {
    Total += 1 ; Total
  }
  def ArticleCounts1(i: Int) //call by nvalue
  {
    println("Tanya did articles " +
      " on day one is 1 - Total = " + i)
    println("Tanya did articles "+
      "on day two is 1 - Total = " + i)
  }
  var Total1 = 0;

  // calling function
  ArticleCounts1
  {
    Total1 += 1 ; Total1
  }


}
