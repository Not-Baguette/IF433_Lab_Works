package oop_00000105215_ClemensPutraKusmeri.week01

fun main(){
  val name: String = "Clemens Putra Kusmeri"
  val score: Int = 90

  println("Nama: $name, Score: $score")

  val grade = when(score){
    in 90 .. 100 -> "A"
    in 80 .. 89 -> "B"
    in 70 .. 79 -> "C"
    else -> "D"
  }

  println("Grade kamu: $grade")
}

