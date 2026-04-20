package oop_00000105215_ClemensPutraKusmeri.week09

fun main(){
  println("=== TEST LIST ===")
  // Immutable list: Tidak bisa diubah setelah dibuat
  val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
  // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
  println("Immutable List: $frameworks")

  // mutable list: Bisa ditambah/dikurangi
  val scores: MutableList<Int> = MutableListOf(85, 90)
  scores.add(95)
  scores[0] = 88
  println("Mutable List: $scores")
}