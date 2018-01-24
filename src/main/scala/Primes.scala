import scala.collection.mutable.ArrayBuffer

object Primes {
  def main(args: Array[String]): Unit = {
    println(noOfPrimes(20000000))
  }

  def noOfPrimes(target: Int) = {
    val primeList = new ArrayBuffer[Int]
    for (i <- 2 to target)
      if (primeTest(i, primeList)) {
        primeList.append(i)
//        println(i)
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
}
