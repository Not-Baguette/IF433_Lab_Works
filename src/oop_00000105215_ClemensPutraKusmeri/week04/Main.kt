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

  println("--- Testing Manager ---")
  val yourManager = Manager("Gavriel Donovan", 69420000)
  yourManager.work()
  println("Bonus: ${yourManager.calculateBonus()}")

  println("--- Testing Developer ---")
  val underworkedEmp = Developer("PASCAL", "Kiara Allysia Puteri Juntoro", 69420000)
  underworkedEmp.work()
  println("Bonus: ${underworkedEmp.calculateBonus()}")
}