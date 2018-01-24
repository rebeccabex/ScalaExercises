package Garage

import scala.collection.mutable.ListBuffer

object newGarage {
  def main(args: Array[String]): Unit = {
    val garage = new Garage
  }
}

class Garage {

  var vehicleList = new ListBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicleList :+ vehicle
  }

  def removeVehicleById(regNo: String): Unit = {
    vehicleList = vehicleList.filterNot(_.regNo == regNo)
  }

  def removeVehicleByType(vehicleType: String): Unit = {
    vehicleList = vehicleList.filterNot(_.regNo == vehicleType)
  }

  def getVehicleById(regNo: String): Vehicle = {
    vehicleList.filter(_.regNo == regNo).head
  }

  def registerCar(regNo: String, colour: String, wheels: Int = 4, doors: Int = 4): Unit = {

  }

}
