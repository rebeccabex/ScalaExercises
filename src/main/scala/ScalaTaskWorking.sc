
def primeTest(number: Int, primeList: Stream[Int]): Boolean = {
  for (i <- primeList) {
    if (number < scala.math.pow(i, 2))
      return true
    else if (number % i == 0)
      return false
  }
  true
}

//println(noOfPrimesCount(3000000))
//println(noOfPrimesCount(1000))
//println(noOfPrimesCount(20000000))

def primeStream(f: (Int, Stream[Int]) => Boolean, n: Stream[Int]): Stream[Int] = {
  if (f(n.head, n.filter(x => x < Math.sqrt(n.head))))
    n.head #:: primeStream(f, n.tail)
  else
    primeStream(f, n.tail)
}

println(primeStream(primeTest, infiniteList(2)).find(_ <= 100))

def infiniteList(n: Int): Stream[Int] = n #:: infiniteList(n + 1)

//def noOfPrimesRec(target: Int, current: Int = 2, primeList: ArrayBuffer[Int] = new ArrayBuffer[Int]): ArrayBuffer[Int] = {
//  if (target == current)
//    if(primeTest(current, primeList))
//      primeList.:+(current)
//    else
//      primeList
//  else {
//    if (primeTest(current, primeList))
//      noOfPrimesRec(target, current + 1, primeList.:+(current))
//    else
//      noOfPrimesRec(target, current + 1, primeList)
//  }
//}
//
//def noOfPrimesRec(target: Int, primeList: ArrayBuffer[Int] = new ArrayBuffer[Int]): ArrayBuffer[Int] = {
//  if (target == 2)
//    primeList.:+(2)
//  else {
//    if (primeTest(target, primeList))
//      noOfPrimesRec(target - 1, primeList.:+(target))
//    else
//      noOfPrimesRec(target - 1, primeList)
//  }
//}

//def noOfPrimesCount(target: Int) = noOfPrimesRec(target).size
