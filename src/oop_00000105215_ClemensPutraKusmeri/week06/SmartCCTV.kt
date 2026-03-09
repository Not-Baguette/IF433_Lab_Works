package oop_00000105215_ClemensPutraKusmeri.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable{
  override fun turnOn(){
    println("$name turns on and starts shooting at thiefs")
    super.startRecord()
  }

  override fun turnOff(){
    println("$name gets turned off and stops shooting")
    super.stopRecord()
  }
}

/*
fun main(){
  val test = smartCCTV("69", "JESS EXTREME CCTV THIEFCATCHER EDITION")
  test.turnOn()
  test.turnOff()
}
*/