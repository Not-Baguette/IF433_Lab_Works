package oop_00000105215_ClemensPutraKusmeri.week03

class Weapon(val name: String){
  private val max: Int = 1000
  private var tier: String? = null
  
  var damage: Int = 0
    set(value){
      if(value>max){
        // OP
        println("Character is too overpowered! Limiting at $max")
        field = max
      } else if(value<0){
        // negative
        println("WARNING! Character have negative damage")
        field = value
      } else{
        field = value
      }
      tierFetch(field)
    }

  fun tierFetch(damage: Int){
    if(damage > 800){
      tier = "Legendary"
    } else if(damage > 500){
      tier = "Epic"
    } else{
      tier = "Common"
    }
  }

  fun debugGetter(){
    println("Name: $name, Damage: $damage, Tier: $tier")
  }
}

