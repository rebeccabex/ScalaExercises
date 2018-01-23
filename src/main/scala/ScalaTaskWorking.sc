
def getTimeZones: Array[String] = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray.flatten

println(getTimeZones.mkString(", "))

def getTimeZonesReduced: String = (for (k <- (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10)) yield k(0)).toArray.mkString("\n")

println(getTimeZonesReduced)

//def printTimeZones(): Unit =
//  for (i <- getTimeZones)
//    println(i.mkString(", "))
//
//printTimeZones()
//
//println(getTimeZones(0).mkString(", "))
//getTimeZones.foreach(println)

val blah = (for (k <- (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1))
  yield j(1)).grouped(10)) yield k(0)).toArray

//val blah = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray

//val blah = for (j <- (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)) yield j(1)

//val blah = (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)

//val blah = for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")

//val blah = for (i <- java.util.TimeZone.getAvailableIDs) yield i

println(blah.mkString("\n"))
