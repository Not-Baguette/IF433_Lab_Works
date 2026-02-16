package oop_00000105215_ClemensPutraKusmeri.week03

fun main(){
  val e = Employee ("Budi")
  println("--- Test Error ---")

  e.salary = -1000
  e.salary = 5000

  e.increasePerformance()

  println("Pajak yang harus dibayar: ${e.tax}")
}