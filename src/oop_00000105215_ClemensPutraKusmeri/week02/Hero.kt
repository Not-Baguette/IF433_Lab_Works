package oop_00000105215_ClemensPutraKusmeri.week02
import java.util.Scanner
import kotlin.random.Random

class Hero(val name: String, var hp: Int = 100, val baseDamage: Int){
  fun attack(targetName: String){
    println("$name menebas $targetName")
  }

  fun takeDamage(damage: Int){
    hp -= damage

    if (hp<0){
      hp = 0
    }
  }

  fun isAlive() = if(hp==0) false else true
}

fun main(){
  val scanner = Scanner(System.`in`)
  var enemyHp: Int = 100
  var baseDamage: Int = 0
  val quotesSet = setOf("May the blood of my enemy flow from my spear!",
                        "Failure is not an option.",
                        "audentes Fortuna iuvat!",
                        )

  println("Welcome to the Hero game!\n\n")
  print("To start, enter your name: ")
  val name: String = scanner.nextLine()
  print("Random Base Damage? (Y/N): ")
  val choice: String = scanner.nextLine()
  if(choice.uppercase() == "Y") {
    baseDamage = Random.Default.nextInt(15, 20)
  } else{
    println("Enter your base damage: ")
    baseDamage = scanner.nextInt()
    scanner.nextLine()
  }
  println("Your base damage is $baseDamage")

  val donovan = Hero(name, baseDamage = baseDamage)

  while(donovan.isAlive() && enemyHp > 0){ // gameloop
    print("Menu\n1. Serang\n2. Kabur\nPilihan (1/2): ")
    var mainloopChoice: Int = scanner.nextInt()
    scanner.nextLine()
    if(mainloopChoice == 1){
      enemyHp -= baseDamage
      println(quotesSet.random())
      donovan.takeDamage((10..15).random())
    } else if(mainloopChoice == 2){
      println("Coward.")
      break
    }
    println("${donovan.name} HP remains: ${donovan.hp}")
    println("Enemy HP remains: $enemyHp")
  }
  if(!donovan.isAlive()){
    println("Game over! The enemy won")
  } else if(enemyHp < 0){
    println("Congratulations $name! The hero won!")
  }
}