package Garage

abstract class Vehicle(val regNo: String, val colour: String, val wheels: Int) {

  override def toString: String = "Registration: " + regNo + "; Colour: " + colour + "; No of wheels: " + wheels

}
