package Garage

class Car(regNo: String, colour: String, wheels: Int = 4, doors: Int = 4, owner: Customer = null) extends
  Vehicle(regNo, colour, wheels, owner) {

  override def toString: String = super.toString + "; No of doors: " + doors
}
