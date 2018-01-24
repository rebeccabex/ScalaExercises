import scala.collection.mutable.ArrayBuffer
// Hashmaps

def sortString(inString: String) = inString.sorted

println(sortString("cab"))


// Prime Numbers 1
def noOfPrimes(target: Int) = {
  val primeList = new ArrayBuffer[Int]
  for (i <- 2 to target)
    if (primeTest(i, primeList)) {
      primeList.append(i)
    }
  primeList.size
}

def primeTest(number: Int, primeList: ArrayBuffer[Int]): Boolean = {
  for (i <- primeList) {
    if (number < scala.math.pow(i, 2))
      return true
    else if (number % i == 0)
      return false
  }
  true
}

println(noOfPrimes(3000000))
//println(noOfPrimes(20000000))

def noOfPrimesRec(target: Int): ArrayBuffer[Int] = { //, primeList: ArrayBuffer[Int]) = {
  if (target == 2)
    ArrayBuffer(2)
  else {
    val primes = noOfPrimesRec(target - 1)
    if (primeTest(target, primes))
      primes.append(target)
    primes
  }
}

def noOfPrimesCount(target: Int) = noOfPrimesRec(target).size

println(noOfPrimesCount(2000))

// Strings
def commonSubSequenceRec(string1: String, string2: String, tail: Boolean): String =
  if (string2.contains(string1))
    string1
  else {
    val substring1 = commonSubSequenceRec(string1.substring(0, string1.length - 1), string2, false)
    if (tail) {
      val substring2 = commonSubSequenceRec(string1.substring(1, string1.length), string2, true)
      if (substring1.length >= substring2.length)
        substring1
      else
        substring2
    } else
      substring1
  }

def commonSubSequence(string1: String, string2: String) =
  if (string1.length >= string2.length)
    commonSubSequenceRec(string2, string1, true)
  else
    commonSubSequenceRec(string1, string2, true)

println(commonSubSequence("abcde", "abcde"))
println(commonSubSequence("abcd", "abcde"))
println(commonSubSequence("bcde", "abcde"))
println(commonSubSequence("cba", "abcde"))
println(commonSubSequence("fgh", "abcde"))
println(commonSubSequence("abce", "abbceabcde"))

def modifyStringToMatch(string1: String, string2: String, currChanges: String = ""): String =
  if (string1 == string2)
    string1
  else {
    var changes = ""
    val common = commonSubSequenceRec(string1, string2, true)
    if (common.isEmpty)
      "[-" + string1 + "][+" + string2 + "]"
    else {
      val remString1 = new Array[String](2)
      val remString2 = new Array[String](2)
      remString1(0) = string1.substring(0, string1.indexOf(common))
      remString2(0) = string2.substring(0, string2.indexOf(common))
      remString1(1) = string1.substring(string1.indexOf(common) + common.length)
      remString2(1) = string2.substring(string2.indexOf(common) + common.length)
      for (i <- 0 to 1) {
        if (i == 1)
          changes += common
        if (!remString1(i).isEmpty)
          if (!remString2(i).isEmpty)
            changes += modifyStringToMatch(remString1(i), remString2(i), changes)
          else
            changes += "[-" + remString1(i) + "]"
        else if (!remString2(i).isEmpty)
          changes += "[+" + remString2(i) + "]"
      }
      changes
    }
  }

println(modifyStringToMatch("abcde", "abcde"))
println(modifyStringToMatch("abcd", "abcde"))
println(modifyStringToMatch("bcd", "abcde"))
println(modifyStringToMatch("bcdfghd", "abcde"))
println(modifyStringToMatch("abcabd", "abcdeabcabdf"))
println(modifyStringToMatch("abcabd", "abcdeabchabdf"))
println(modifyStringToMatch("conversation", "conservation"))











