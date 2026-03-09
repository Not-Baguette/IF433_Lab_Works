package oop_00000105215_ClemensPutraKusmeri.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable{
  override fun turnOn(){
    println("$name starts playing")
  }

  override fun turnOff(){
    println("$name gets turned off")
  }

  fun playMusic(song: String){
    println("Memutar lagu $song dari Spotify.")
  }
}

/*
fun main(){
  val test = SmartSpeaker("30", "NAOMISPEAKER PREMIUM EDITION")
  test.turnOn()
  test.turnOff()

  test.playMusic("HONNE - Location Unknown (Ft. NIKI) [10 YEARS]")
}
*/