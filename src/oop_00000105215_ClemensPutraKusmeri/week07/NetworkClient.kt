package oop_00000105215_ClemensPutraKusmeri.week07

class NetworkClient private constructor(val url: String){
  fun connect(){
    println("Connecting to $url")
  }
}