package oop_00000105215_ClemensPutraKusmeri.week03


class Player(val username: String){
  private var xp: Int = 0
  var level: Int = (xp/100) + 1

  fun debugGetter(){
    println("xp = $xp, level = $level, username = $username")
  }

  fun recheckLvl(){
    var oldLvl = level
    level = (xp/100) + 1

    if(oldLvl != level) println("Level Up! Selamat $username naik ke level $level")
  }

  fun addXp(amount: Int){
    if(amount<0){
      println("Does not accept negative xp")
    } else{
      xp += amount
      println("Increased XP by $amount, total XP is $xp")
    }
    recheckLvl()
  }
}


fun main(){
  val test: Player = Player("jesselyn")
  test.debugGetter()
  test.addXp(50)
  test.debugGetter()
  test.addXp(60)
  test.debugGetter()
}