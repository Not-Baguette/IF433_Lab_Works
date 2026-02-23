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

  println("--- Testing Electric Car ---")
  val myActualCar = ElectricCar(brand="GMC Yukon 2026", numberOfDoors=4)
  myActualCar.openTrunk()
  myActualCar.honk()
  myActualCar.accelerate()
  myActualCar.accelerate()
  myActualCar.accelerate()
}