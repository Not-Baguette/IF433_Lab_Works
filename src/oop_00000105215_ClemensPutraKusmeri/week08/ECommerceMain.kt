package oop_00000105215_ClemensPutraKusmeri.week08

fun main() {
  println("Starting week 8 e-commerce pipeline")

  val rawApiData: List<Map<String, Any?>> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
  )

  val parser = ApiParser()

  for (raw in rawApiData) {
    try {
      val product = parser.parseProduct(raw)
      product?.let {
        parser.checkout(it)
      } ?: println("Skipped unknown product type")
    } catch (exception: IllegalArgumentException) {
      println("Invalid payload: ${exception.message}")
    }
  }

  println("Week 8 e-commerce pipeline complete")
}