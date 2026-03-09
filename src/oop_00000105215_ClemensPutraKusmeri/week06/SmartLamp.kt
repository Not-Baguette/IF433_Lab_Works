package oop_00000105215_ClemensPutraKusmeri.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable{
  override fun turnOn(){
    println("$name turns on brightly")
  }

  override fun turnOff(){
    println("$name gets turned off")
  }
}

/*
fun main(){
  val test = SmartLamp("SXSVN100", "ANGELLAMP Pro")
  test.turnOn()
  test.turnOff()
}
*/