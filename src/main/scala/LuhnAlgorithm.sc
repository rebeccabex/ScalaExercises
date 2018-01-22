
def sumDigitsModTen(inNumber: String): Int = {
  var sum = 0
  for (i <- inNumber.length - 1 to 0 by -1) {
    val j = inNumber.substring(i, i+1).toInt
    if (i % 2 == 0)
      sum += j
    else {
      val k = j * 2
      sum += (k / 10) + (k % 10)
    }
  }
  sum % 10
}

def sumDigitsRec(inNumber: String): Int = {
  if (inNumber.length == 1) {
//    println("A " + inNumber.toInt)
    inNumber.toInt
  }
  else if (inNumber.length % 2 == 0) {
//    println("B " + inNumber.take(0).toInt / 10 + (inNumber.take(0).toInt % 10))
    inNumber.take(0).toInt / 10 + (inNumber.take(0).toInt % 10) + sumDigitsRec(inNumber.tail)
  }
  else {
//    println("C " + inNumber.take(0).toInt)
    inNumber.take(0).toInt + sumDigitsRec(inNumber.tail)
  }
}

println(sumDigitsRec("49927398716"))

def addCheckDigit(inNumber: String): String = {
//  var sum = 0
//  for (i <- inNumber.length - 1 to 0 by -1) {
//    val j = inNumber.substring(i, i+1).toInt
//    if (i % 2 == 0)
//      sum += j
//    else {
//      val k = j * 2
//      sum += (k / 10) + (k % 10)
//    }
//  }
  inNumber + (10 - sumDigitsModTen(inNumber + "0")).toString
//  inNumber + (10 - sum % 10).toString
}

println(addCheckDigit("4992739871"))
println(addCheckDigit("2131532524"))
println(addCheckDigit("7992739871"))
println(addCheckDigit("49927398713"))

def validIdentifier(inNumber: String): Boolean =
  sumDigitsModTen(inNumber) == 0

println(validIdentifier("49927398716"))
println(validIdentifier("21315325247"))
println(validIdentifier("79927398713"))
println(validIdentifier("49927398713"))
println(validIdentifier("79927398719"))

