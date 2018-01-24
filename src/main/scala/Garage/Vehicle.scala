package Garage

abstract class Vehicle(val regNo: String, val colour: String, val wheels: Int, var owner: Customer = null) {

  override def toString: String = "Registration: " + regNo + "; Colour: " + colour + "; No of wheels: " + wheels +
    "; Owned by:\n\t" + owner.toString


  def newOwner(customer: Customer) = {
    owner = customer
  }



}
