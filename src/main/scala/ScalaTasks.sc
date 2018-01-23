// Hello World!
println("Hello World")

// Assignment
var hw = "Hello World"
println(hw)

// Parameters
def printString(inString: String): Unit = println(inString)

printString("Hello World")

// Return types
def helloWorld(): String = "Hello World"

println(helloWorld())

// Type inferences
def inference(input: Any) = input

println(inference(1.5))
println(inference("String"))
println(inference(1))
println(inference(false))

// Strings
def endOfString(inString: String, noOfChars: Int): String =
  inString.substring(inString.length - noOfChars)

println(endOfString("Hello", 3))

// Strings 2
def stringConcatAndReplace(firstString: String, secondString: String, oldChar: Char, newChar: Char): String = {
  val fullString = firstString concat secondString
  fullString.replace(oldChar, newChar)
}

println(stringConcatAndReplace("Ha", "llo", 'a', 'e'))

// Operators
def sum(firstInt: Int, secondInt: Int): Int = firstInt + secondInt

println(sum(5, 10))

// Conditionals
def sumOrProduct(firstInt: Int, secondInt: Int, doSum: Boolean): Int =
  if (doSum)
    firstInt + secondInt
  else
    firstInt * secondInt

println(sumOrProduct(5, 10, true))
println(sumOrProduct(5, 10, false))


// Conditionals2
def sumOrNonZero(firstInt: Int, secondInt: Int): Int =
  if (firstInt == 0)
    secondInt
  else if (secondInt == 0)
    firstInt
  else
    firstInt + secondInt

println(sumOrNonZero(5, 10))
println(sumOrNonZero(5, 0))

// Iteration
def repeatString(inString: String, noOfCopies: Int): Unit =
  for (i <- 1 to noOfCopies)
    println(inString)

repeatString("Hi", 3)

// Iteration 2
def repeatStringSquare(inString: String, noOfCopies: Int): Unit =
  for (i <- 1 to noOfCopies)
    println(inString * noOfCopies)

repeatStringSquare("H", 4)
repeatStringSquare("Hi", 4)

def repeatStringSquarePretty(inString: String, noOfCopies: Int): Unit =
  for (i <- 1 to noOfCopies) {
    println(inString * noOfCopies)
    for (j <- 2 to inString.length)
      println()
  }

repeatStringSquarePretty("H", 4)
repeatStringSquarePretty("Hi", 4)

// Iteration 3
def fizzBuzz(firstString: String, secondString: String, target: Int): Unit =
  for (i <- 1 to target) {
    if (i % 15 == 0)
      print(firstString + secondString)
    else if (i % 3 == 0)
      print(firstString)
    else if (i % 5 == 0)
      print(secondString)
    else
      print(i)
    if (i != target) {
      print(",")
    }
  }

fizzBuzz("Fizz", "Buzz", 15)

// Iteration 4
// Recursion 1
def repeatStringRecursion(inString: String, noOfCopies: Int): String =
  if (noOfCopies == 1)
    inString
  else
    repeatStringRecursion(inString, noOfCopies - 1) + "\n" + inString

println(repeatStringRecursion("Hi", 3))

// Recursion 2 -- not working properly
def repeatStringSquareRecursion(inString: String, noOfCopies: Int): String = {
  if (noOfCopies == 1)
    inString * noOfCopies
  else
    repeatStringSquareRecursion(inString, noOfCopies - 1) + "\n" + inString * noOfCopies
}

println(repeatStringSquareRecursion("H", 4))
println(repeatStringSquareRecursion("Hi", 4))

// Recursion 3
def fizzBuzzRecursion(firstString: String, secondString: String, target: Int): String =
  if (target == 1)
    "1"
  else {
    val returnString = fizzBuzzRecursion(firstString, secondString, target - 1)
    if (target % 15 == 0)
      returnString + "," + firstString + secondString
    else if (target % 3 == 0)
      returnString + "," + firstString
    else if (target % 5 == 0)
      returnString + "," + secondString
    else
      returnString + "," + target
  }

println(fizzBuzzRecursion("Fizz", "Buzz", 15))

// Pattern Matching 1


// Pattern Matching 2
def swapPair(first: Int, second: Int): Any =
  (second, first)

println(swapPair(1,2))

def swapFirstPair(input: Array[Int]): Array[Int] = {
  val temp = input(1)
  input(1) = input(0)
  input(0) = temp
  input
}

println(swapFirstPair(Array(1, 2, 3, 4)).deep.mkString(", "))

// Functional 1
def getTimeZones: String = (for (k <- (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10)) yield k(0)).toArray.toString//mkString("\n")

println(getTimeZones)
























