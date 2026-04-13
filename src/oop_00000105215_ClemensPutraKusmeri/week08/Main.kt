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

  val onlyStrings = mixedData.mapNotNull { it as? String }
  println("Filtered strings: ${onlyStrings.joinToString(", ")}")

  for (item in mixedData) {
    val text = item as? String ?: "[bukan string]"
    println(text)
  }
}

fun demonstrateSafeCastFallback() {
  val rawValue: Any? = 100
  val parsedString = rawValue as? String ?: "Fallback string"
  println("Hasil fallback: $parsedString")
}

fun demonstrateRequireNotNullAlternative() {
  val maybeToken: String? = "VALID-TOKEN"
  val token = requireNotNull(maybeToken) {
    "Token harus tersedia"
  }

  println("Token aman: $token")
}

fun demonstrateLegacyInterop() {
  val legacyMessage = LegacyJavaAPI.getLegacyMessage()!!
  println(legacyMessage)
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

  println("\n=== Elvis Fallback ===")
  demonstrateSafeCastFallback()

  println("\n=== Safe Casting Demo Complete ===")

  println("\n=== Red Button Trial ===")
  println("\n=== requireNotNull Alternative ===")
  demonstrateRequireNotNullAlternative()

  println("\n=== Java Interop with !! ===")
  demonstrateLegacyInterop()
}