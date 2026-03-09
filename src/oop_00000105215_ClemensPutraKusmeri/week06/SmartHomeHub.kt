package oop_00000105215_ClemensPutraKusmeri.week06

class SmartHomeHub{
  val devices = mutableListOf<SmartDevice>()

  fun addDevice(device: SmartDevice){
    devices.add(device)
  }

  fun turnOffAllSwitches(){
    for (i in devices){
      if (i is Switchable){
        i.turnOff()
      }
    }
  }
}

/*
fun main(){
  val test = SmartHomeHub()
  val amogus = SmartCCTV("69", "JESS EXTREME CCTV THIEFCATCHER EDITION")
  val amogus1 = SmartLamp("SXSVN100", "ANGELLAMP Pro")
  val amogus2 = SmartSpeaker("30", "NAOMISPEAKER PREMIUM EDITION")

  test.addDevice(amogus)
  test.addDevice(amogus1)
  test.addDevice(amogus2)

  test.turnOffAllSwitches()
}
*/