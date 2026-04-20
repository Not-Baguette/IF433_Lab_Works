package oop_00000105215_ClemensPutraKusmeri.week09

fun main(){
  println("=== TEST LAMBDA ===")

  val sumLambda = {a:Int, b:Int -> a+b}
  println("Hasil sum: ${sumLambda(5, 10)}")

  // lambda dengan 1 param bisa menggunakan implicit 'it'
  val squareImplicit: (Int) -> Int = {it*it}
  println("Hasil Square: ${squareImplicit(4)}")
}