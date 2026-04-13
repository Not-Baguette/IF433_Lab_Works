package oop_00000105215_ClemensPutraKusmeri.week08

fun demonstrateNullableProfile() {
  val profile = UserProfile(
    id = "USR-08-01",
    displayName = "Alya",
    email = null,
    phoneNumber = "08123456789"
  )

  NotificationService.sendWelcomeMessage(profile)
}

fun demonstrateNestedSafeCalls() {
  val order = Order(
    orderId = "ORD-08-001",
    customer = Customer(
      name = "Clemens",
      address = Address(
        street = "Jl. Melati 12",
        city = "Jakarta",
        postalCode = "12345"
      )
    )
  )

  val city = order.customer?.address?.city ?: "Kota tidak ditemukan"
  println("Kota pengiriman: $city")
}

fun demonstrateSafeCallLet() {
  val order = Order(
    orderId = "ORD-08-002",
    customer = Customer(
      name = "Nadia",
      address = Address(
        street = "Jl. Kenanga 7",
        city = "Bandung",
        postalCode = null
      )
    )
  )

  order.customer?.address?.city?.let { city ->
    println("Alamat valid ditemukan di $city")
  }
}

fun demonstrateMixedCollectionCasting() {
  val mixedData: List<Any?> = listOf(
    "Kotlin",
    42,
    null,
    "Advanced Null Safety",
    3.14,
    "Week 8"
  )

  for (item in mixedData) {
    val text = item as? String ?: "[bukan string]"
    println(text)
  }
}

fun main() {
  println("=== Nullable Types & Smart Casting ===")
  demonstrateNullableProfile()

  println("\n=== Nested Safe Calls ===")
  demonstrateNestedSafeCalls()

  println("\n=== Safe Call with let ===")
  demonstrateSafeCallLet()

  println("\n=== Safe Casting as? ===")
  demonstrateMixedCollectionCasting()
}