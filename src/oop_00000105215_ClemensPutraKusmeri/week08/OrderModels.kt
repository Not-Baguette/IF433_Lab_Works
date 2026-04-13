package oop_00000105215_ClemensPutraKusmeri.week08

data class Address(
  val street: String?,
  val city: String?,
  val postalCode: String?
)

data class Customer(
  val name: String,
  val address: Address?
)

data class Order(
  val orderId: String,
  val customer: Customer?
)