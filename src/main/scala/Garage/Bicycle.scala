package Garage

class Bicycle(regNo: String, colour: String, wheels: Int = 2, gears: Int = 18) extends Vehicle(regNo, colour, wheels) {

  override def toString: String = super.toString + "; No of gears: " + gears
}
