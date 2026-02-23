package oop_00000105215_ClemensPutraKusmeri.week04

open class Vehicle(val brand: String){
  var speed: int = 0

  open fun accelerate(){
    speed += 10
    println("$brand melaju kedepan: $speed km/jam")
  }

  open fun honk(){
    println("Beep beep!")
  }
}