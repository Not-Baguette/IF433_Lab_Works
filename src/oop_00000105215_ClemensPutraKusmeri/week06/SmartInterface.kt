package oop_00000105215_ClemensPutraKusmeri.week06

interface SmartDevice{
  val id: String
  val name: String
}

interface Switchable{
  abstract fun turnOn()
  abstract fun turnOff()
}

interface Recordable{
  fun startRecord(){ println("Perekaman dimulai")}
  fun stopRecord(){ println("Perekaman dihentikan dan disimpan ke Cloud.") }
}

/*
class Test: SmartDevice, Switchable, Recordable{
  override val id: String = "67"
  override val name: String = "Donovan Premium"
  
  override fun turnOn(){
    println("test1")
  }

  override fun turnOff(){
    println("test2")
  }
  
  override fun startRecord(){
    println("Perekaman dimulai")
  }
}

fun main(){
  val ie = Test()
  ie.turnOn()
  ie.turnOff()
}

*/