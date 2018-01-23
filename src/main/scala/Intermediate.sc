
// Blackjack
case class Scores(p1: Int, p2: Int)
def blackjack(x: Int, y: Int): Int = Scores(x, y) match {
  case scores if scores.p1 > 21 && scores.p2 > 21 => 0
  case scores if scores.p1 > 21 => scores.p2
  case scores if scores.p2 > 21 => scores.p1
  case scores if scores.p1 > scores.p2 => scores.p1
  case scores if scores.p2 >= scores.p1 => scores.p2
  case _ => -1
}

println(blackjack(18, 21))
println(blackjack(20, 18))
println(blackjack(22, 22))

// Unique Sum
def uniqueSum(x: Int, y: Int, z: Int): Int =
  if (x == y)
    if (x == z)
      0
    else
      z
  else if (y == z)
    x
  else if (x == z)
    y
  else
    x + y + z

println(uniqueSum(1, 2, 3))
println(uniqueSum(3, 3, 3))
println(uniqueSum(1, 1, 2))

// Too Hot?
def tooHot(temperature: Int, isSummer: Boolean): Boolean =
  if (temperature < 60)
    false
  else if (isSummer)
    temperature <= 100
  else
    temperature <= 90

println(tooHot(80, false))
println(tooHot(100, false))
println(tooHot(100, true))

