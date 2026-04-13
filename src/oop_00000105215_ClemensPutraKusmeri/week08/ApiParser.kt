package oop_00000105215_ClemensPutraKusmeri.week08

class ApiParser {
  fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id = requireNotNull(rawJson["id"] as? String) {
      "API Invalid: Missing ID"
    }

    val name = requireNotNull(rawJson["name"] as? String) {
      "API Invalid: Missing Name"
    }

    val type = rawJson["type"] as? String ?: return null

    return when (type.uppercase()) {
      "ELECTRONIC" -> {
        val warrantyMonths = rawJson["warranty"] as? Int ?: 12
        Electronic(id, name, warrantyMonths)
      }

      "CLOTHING" -> {
        val size = rawJson["size"] as? String ?: "All Size"
        Clothing(id, name, size)
      }

      else -> null
    }
  }
}