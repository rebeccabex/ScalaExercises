package Garage

class Employee(id: Int, name: String, var phoneNumber: String) extends Person(id, name) {

  override def toString: String = super.toString + "; JobTitle: " + phoneNumber
}
