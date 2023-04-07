package com.labs1904.hwe.exercises


object ChallengeProblems {
  /*
    1. Define a function that takes in a String and returns that string with no changes
    Write your function below this comment - refer to Challenge Tests to have your test pass
    Params - String
    Returns - String
  */

  def sameString (str: String): String = {
    str
  }


  /*
  2. Write a function that returns "Hello World!" and takes in nothing as a parameter
  Params - None
  Returns - String
   */

  def helloWorld(): String = {
    val helloWorld = "Hello World!"
    helloWorld
  }

  /*
  3. Write a function that takes in a list and returns the total size of the list
  -Note - Use the .size method
  Params - List[Int]
  Returns - Int
   */

  def listSize(ls: List[Int]): Int =  {
    val size = ls.size
    size
  }

  /*
  4. Write a function that takes in an int and adds an int that you create within the function and returns the addition of the two together
  Note - Your variable must be a val and must be equal to 25
  Params - Int
  Returns - Int
   */

  def sumInts(int: Int): Int = {
    val sum = int + 25
    sum
  }


  /*
  5. Write a function that takes in a list of strings, and return a list of strings where every letter is capitalized
  Hint - you can use .map here
  Params - List[String]
  Returns - List[String]
*/

def upper(str:List[String]):List[String]  = {
  val upper = str.map(x => x.toUpperCase)
    upper
  }

  /*
  6. Write a function that returns a new list, where only elements of the list passed in that are 0 or positive numbers are kept.
  Params - List[Int]
  Returns - List[Int]
   */

  def filterNegatives(int: List[Int]): List[Int] = {
    val postitiveList = int.filter(x => x >= 0)
    postitiveList
  }

  /*
  7. Returns a new list, where only the elements passed in containing "car" are kept to the new list.
  Params - List[String]
  Returns - List[String]
 */

def containsCar(ls:List[String]): List[String] = {
  ls.filter(x => x.contains("car"))
}

  /*
    8. Returns the sum of all numbers passed in.
    Params - List[Int]
    Returns - Int
   */

//  Using foldLeft
//  def sumList(num:List[Int]): Int = {
//    val sumAdd = num.foldLeft(0)((acuum, totals) => acuum + totals)
//    sumAdd
//  }

//  Using .sum
  def sumList(num:List[Int]): Int = {
    val sumAdd = num.sum
    sumAdd
  }

  /*
  9. Write a function that takes in an integer with a cats age, and return the human age equivalent.
    A human year is equivalent to 4 cat years
    Params - Int
    Returns - Int
   */

  def catsAge(num:Int): Int = {
    val humAge = num * 4
    humAge
  }

  /*
  10. Same question as #9, but this time you are given a Option[Int]
    If an int is provided, returns a cats age for the human's age equivalent.
    If None is provided, return None
    A humanYear is equivalent to four catYears
    -Params - Option[Int]
    -Returns - Option[Int]
 */

  def catsAgeOption(cAge: Option[Int]): Option[Int] = {
    val hAge = cAge.map(x => x*4)
      hAge
  }

  /*
  11. Write a function that takes in a list of ints, and return the minimum of the ints provided
  Params - List
  Returns - Int
   */

  def minimum(param:List[Int]): Int = {
    val mini = param.min
    mini
}

  /*
  12. Same as question 11, but this time you are given a list of Option[Ints], returns the minimum of the Ints provided.
  If no ints are provided, return None.
 */

def minimumOption(max:List[Option[Int]]): Option[Int] = {
  val min = max.minBy(x => x.getOrElse(0))
  min
}

}
