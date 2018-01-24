package Garage

import scala.collection.mutable.ListBuffer

class Customer(id: Int, name: String, var phoneNo: String) extends Person(id, name) {

  override def toString: String = super.toString + "; JobTitle: " + phoneNo

  val vehicleList = new ListBuffer[Vehicle]

  def newVehicle(vehicle: Vehicle): Unit = {
    vehicleList :+ vehicle
  }

  def removeVehicle(vehicle: Vehicle): Unit = {
    vehicleList - vehicle
  }

}
