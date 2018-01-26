
// Maps 1
def multiplyOverTwenty(input: Array[Int]): Array[Int] = input.flatMap(x => if (x > 20) Some(x * 10) else Some(x))

println(multiplyOverTwenty(Array(1, 2, 10, 20, 30, 35)).mkString(", "))

// Maps 2
def keepLongerStrings(input: Array[String]): Array[String] = input.flatMap(x => if (x.length < 4) None else Some(x))

val stringArray = Array("ab", "abcdef", "abc", "abcdefgh", "abcd")
println(keepLongerStrings(stringArray).mkString(", "))

// Flatmaps 1
def flattenList(input: List[List[List[Int]]]): List[Int] = input.flatten.flatten

val intList = List(List(List(1,2,3,4,5), List(6,7,8,9,10)), List(List(11,12,13,14,15), List(16,17,18,19,20)))
println(flattenList(intList).toString)

// Functional 2

def isFibonacci(input: List[Int]): Boolean = {
  val revSort = input.sorted.reverse
  if (revSort.length < 2) true
  else if (revSort.length == 3)
    tripleIsSum(revSort(2), revSort(1), revSort.head)
  else
    isFibonacci(revSort.tail) && tripleIsSum(revSort(2), revSort(1), revSort.head)
}

def tripleIsSum(input: (Int, Int, Int)): Boolean = input._1 + input._2 == input._3

println(isFibonacci(List(0, 1, 1, 2, 3, 5)))
println(isFibonacci(List(1, 1, 2, 3, 5)))
println(isFibonacci(List(1, 3, 1, 5, 0, 2)))
println(isFibonacci(List(0, 1, 1, 2, 3, 6)))

//  input.sorted match {
//  case _.foreach => true
//
//}

// Functional 3

def greatestCommonDivisor(firstNo: Int, secondNo: Int): Int = {
  val diff = Math.abs(firstNo - secondNo)
  if (diff == 0)
    Math.max(firstNo, secondNo)
  else
    greatestCommonDivisor(Math.min(firstNo, secondNo), diff)
}

println(greatestCommonDivisor(6, 4))
println(greatestCommonDivisor(4, 6))
println(greatestCommonDivisor(252, 105))
println(greatestCommonDivisor(101, 6))
println(greatestCommonDivisor(99, 100))
println(greatestCommonDivisor(120, 100))

// Functional 4

def tailRecFactorial(n: Int, factorial: Int = 1): Int = {
  if (n == 1)
    factorial
  else
    tailRecFactorial(n - 1, n * factorial)
}

println(tailRecFactorial(8))
println(tailRecFactorial(15))

// Functional 5

def stringContainsString(string1: String, string2: String): Boolean = {
  string2.contains(string1)
}

def stringAppearsInString(string1: String, string2: String): Boolean = {
  if (string2.contains(string1))
    true
  else
    string2.contains(string1.head) && stringAppearsInString(string1.tail, string2.substring(string2.indexOf(string1.head)))
}

println(stringContainsString("abc", "abcde"))
println(stringContainsString("abe", "abcde"))
println(stringAppearsInString("abe", "abcde"))
println(stringAppearsInString("abf", "abcde"))

// Functional 6

def higherFunction(func: (String, String) => Boolean, string1: String, string2: String): Boolean = {
  func(string1, string2)
}

println(higherFunction(stringContainsString, "abc", "abcde"))
println(higherFunction(stringContainsString, "abe", "abcde"))

// Functional 7

val string1 = "abc"
val string2 = "abcde"
val string3 = "abe"

println(higherFunction((x: String, y: String) => y.contains(x), string1, string2))
println(higherFunction((x: String, y: String) => y.contains(x), string3, string2))

// Functional 8

def applyDiscount(amount: Double): Double = {
  var total = amount
  if (total > 5.0)
    total = total * 0.9
  total * 1.2
}

println(applyDiscount(4.0))
println(applyDiscount(5.0))
println(applyDiscount(6.0))

