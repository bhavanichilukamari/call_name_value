object Collections_Scala1 extends App {

  val mylist1 = List("bhanu", "GFG",
    "bhavani", "big_data")
  println("The head of the list is:")
  println(mylist1.head)// head of the list
  val  mylist2 = List(1,2,3,4)
  for(i<-mylist2){
    println(i)
  }
  println(mylist2.reverse)//reversing the order of the list
  println(10::mylist2)//adding a element to the starting of the list
  println(45 +: mylist2 :+ 36)//apending and prepending
  println(mylist1.mkString("-"))//making a list with - in between the string
  // map collection
  val mapIm = Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Chary" -> 50).withDefaultValue(-1)
  //map operation
  val ajay = mapIm("Ajay")
  println(ajay)
  println(mapIm.map(x => x._1 toLowerCase()))//map operation
  println(mapIm.mapValues(x => x * 10)) //mapvalues operation
 println(mapIm.filterKeys(x => x.startsWith("A")))//FILTER OPERATION
println(mapIm("Bhanu"))//when there no key it returns -1 as mention in the map
  // Array collection
  val  Arr_collec = Array(1,2,3,4)
  for(i<-Arr_collec){
    println(i)
  }
  println(Arr_collec(2))
  // set : which holds unique values
   val z = Set(1,1,2,2,3,3)
  for(i<-z){
  println(i)
  }
  //range

   val ran = 1 to 5
  for(i<-ran){
    println(i)
  }
  val ran1 = (1 to 3).foreach(x => println("Hello"))

}
