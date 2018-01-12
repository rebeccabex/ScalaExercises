
def xgetTimeZones(): Array[String] = for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/").filter(_.length > 1).tail.head.grouped(10).mkString(",")

def getTimeZones(): Array[Array[String]] = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray

println(getTimeZones())



println(for (i <- java.util.TimeZone.getAvailableIDs) yield i.split("/").filter(_.length > 1).mkString(" , "))
println(for (i <- java.util.TimeZone.getAvailableIDs) yield i)

//val blah = for (i <- java.util.TimeZone.getAvailableIDs) yield i
//blah.foreach(println)

val foo = (for (j <- (for (i <- java.util.TimeZone.getAvailableIDs)
  yield i.split("/")).filter(_.length > 1)) yield j(1)).grouped(10).toArray
//    .tail.head.grouped(10).mkString(",")
//for (j <- foo) println(j.mkString(", "))
//println(foo.mkString(", ").mkString(", "))
