

// Strings 2

def modifyStringToMatch(string1: String, string2: String): String =
  if (string1 == string2)
    ""
  else {
    if (string2.contains(string1)) {
      val begin = string2.substring(0, string2.indexOf(string1))
      val end = string2.substring(string2.indexOf(string1) + string1.length)
      return begin + end
    }
    modifyStringToMatch(string1.substring(0, string1.length - 1), string2)
  }

//var missing = ""
//    for (i <- string1.toCharArray) {
//      if (!string2.contains(i))
//        missing += i
//    }
//    missing
//  }
println(modifyStringToMatch("abcde", "abcde"))
println(modifyStringToMatch("abcd", "abcde"))
println(modifyStringToMatch("bcd", "abcde"))
println(modifyStringToMatch("bcdfghd", "abcde"))
