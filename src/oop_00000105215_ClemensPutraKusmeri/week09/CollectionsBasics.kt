package oop_00000105215_ClemensPutraKusmeri.week09

fun main(){
  println("=== TEST LIST ===")
  // Immutable list: Tidak bisa diubah setelah dibuat
  val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
  // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
  println("Immutable List: $frameworks")

  // mutable list: Bisa ditambah/dikurangi
  val scores: MutableList<Int> = mutableListOf(85, 90)
  scores.add(95)
  scores[0] = 88
  println("Mutable List: $scores")

  println("\n=== TEST SET ===")
  val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
  println("Unique Numbers (Set): $uniqueNumbers")

  val activeUsers = mutableSetOf("UserA", "UserB")
  activeUsers.add("UserC")
  activeUsers.add("UserA")
  println("Active Users: $activeUsers")

  println("\n=== TEST MAP ===")
  val studentGrades = mapOf(
    "Alice" to "A",
    "Bob" to "B",
    "Charlie" to "A" // value boleh duplikat, key tidak
  )
  println("Nilai Bob: ${studentGrades["Bob"]}")

  val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
  inventory["Oranges"] = 20
  inventory["Apples"] = 45
  println("Inventory: $inventory")
}