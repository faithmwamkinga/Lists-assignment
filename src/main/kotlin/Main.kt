fun main(){
    //Given a list of 10 strings, write a function that returns a list of the strings
    //at even indices i.e index 2,4,6 etc
     myList()
    println(myList())
    peoplesHeights()
    println(peoplesHeights())
    println(peoplesHeights())
    heights()
    println()
}
fun myList ():List<String>{

  val myNames = listOf("Greg","Godwin","Gregorio","Godlove","Gordon",
        "Grey","Goodluck","George","Geofrey","Godfrey")

   val  ourFilteredString = myNames.filterIndexed { index, myName -> index %2==0 }
    return ourFilteredString
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun peoplesHeights():Double {
    val heights = listOf(1.9, 2.0, 1.5, 1.8, 2.3)
    return heights.sum()
     return heights.average()


}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var  names:String,var  age:Int,var height:Double,var weight:Double)
fun heights (){
    val person1= Person("Joan",15,1.5,45.0)
    val person2 = Person("Joune",17,1.6,60.0)
    val  person3 = Person ("Lekishon",44,2.0,70.0,)
    val  person4 = Person("Necta",24,1.7,60.0)
    val person5 = Person("Angel",14,1.56,50.0)

    val personList = listOf(person1,person2,person3,person4,person5)
    //val sorted = personList.sortedByDescending {  }
 val sorted= personList.sortedByDescending { person -> person.age }
  println(sorted)
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//data class Person(var  names:String,var  age:Int,var height:Double,var weight:Double)
//fun heights (){
//    val person1= Person("Joan",15,1.5,45.0)
//    val person2 = Person("Joune",17,1.6,60.0)
//    val  person3 = Person ("Lekishon",44,2.0,70.0,)
//    val  person4 = Person("Necta",24,1.7,60.0)
//    val person5 = Person("Angel",14,1.56,50.0)
//
//    val personList = listOf(person1,person2,person3,person4,person5)
//    //val sorted = personList.sortedByDescending {  }
//    val sorted= personList.sortedByDescending { person -> person.age }
//    println(sorted)
//}
//fun addedList(){
//    var additionalList = listOf()
//}