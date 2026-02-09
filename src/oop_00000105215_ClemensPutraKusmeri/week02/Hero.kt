class Hero(val Name: String, var hp: Int = 100, val baseDamage: Int){
  fun attack(targetName: String){
    println("$name menebas $targetName")
  }

  fun takeDamage(damage: Int){
    hp -= damage

    if (hp<0){
      hp = 0
    }
  }

  fun isAlive() = if(hp=0) "False" else "True"
}