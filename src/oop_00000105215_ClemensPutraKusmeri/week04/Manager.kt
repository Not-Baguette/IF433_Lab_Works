package oop_00000105215_ClemensPutraKusmeri.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary){
  override fun work(){
    println("$name sedang memimpin rapat divisi.")
  }

  override fun calculateBonus(): Int{
    return (super.calculateBonus() + 500000)
  }
}

fun main(){
  println("--- Testing Manager ---")
  val yourManager = Manager("Gavriel Donovan", 69420000)
  yourManager.work()
  println("Bonus: ${yourManager.calculateBonus()}")
}