
def sumDigitsRec(inNumber: String): Int =
  if (inNumber.length == 1)
    inNumber.toInt
  else if (inNumber.length % 2 == 0) {
    val doubled = inNumber.take(1).toInt * 2
    doubled / 10 + (doubled % 10) + sumDigitsRec(inNumber.tail)
  }
  else
    inNumber.take(1).toInt + sumDigitsRec(inNumber.tail)

def addCheckDigit(inNumber: String): String =
  inNumber + (10 - sumDigitsRec(inNumber + "0") % 10).toString

println(addCheckDigit("4992739871"))
println(addCheckDigit("2131532524"))
println(addCheckDigit("7992739871"))
println(addCheckDigit("49927398713"))
println(addCheckDigit("1234567812345678"))
println(addCheckDigit("1234567812345670"))

def validIdentifier(inNumber: String): Boolean =
  sumDigitsRec(inNumber) % 10 == 0

println(validIdentifier("49927398716"))
println(validIdentifier("21315325247"))
println(validIdentifier("79927398713"))
println(validIdentifier("49927398713"))
println(validIdentifier("79927398719"))
println(validIdentifier("1234567812345678"))
println(validIdentifier("1234567812345670"))

