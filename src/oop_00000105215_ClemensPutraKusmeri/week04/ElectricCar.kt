package oop_00000105215_ClemensPutraKusmeri.week04

class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int = 100): Car(brand, numberOfDoors){

  final override fun accelerate(){
    speed += 10
    batteryCapacity -= (0..5).random()
    println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
  }
}