package oop_00000105215_ClemensPutraKusmeri.week07

object GameManager{
  var isGameRunning: Boolean = false

  fun startGame(){
    if (isGameRunning){
      println("Game sudah berjalan!")
      return
    }
    isGameRunning = true
  }
}