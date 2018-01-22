


def getTimeZones: Array[Array[String]] = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray

println(getTimeZones.foreach(_.mkString(", ")))

val blah = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray

//val blah = for (j <- (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)) yield j(1)

//val blah = (for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")).filter(_.length > 1)

//val blah = for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/")

//val blah = for (i <- java.util.TimeZone.getAvailableIDs) yield i
println(blah.foreach(_.toString))
blah.foreach(println)//(_.mkString(", ")))
