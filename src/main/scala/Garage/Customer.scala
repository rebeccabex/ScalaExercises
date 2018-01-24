package Garage

class Customer(id: Int, name: String, var phoneNo: String) extends Person(id, name) {

  override def toString: String = super.toString + "; JobTitle: " + phoneNo
}
