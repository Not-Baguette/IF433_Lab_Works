package oop_00000105215_ClemensPutraKusmeri.week04

fun main(){
  println("--- Testing Vehicle ---")
  val generalVehicle = Vehicle("Sepeda Onthel")
  generalVehicle.honk()
  generalVehicle.accelerate()

  println("--- Testing Car ---")
  val myCar = Car("Toyota", 4)
  myCar.openTrunk()
  myCar.honk()
  myCar.accelerate()
}