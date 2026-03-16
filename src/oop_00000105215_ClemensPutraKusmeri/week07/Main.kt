package oop_00000105215_ClemensPutraKusmeri.week07

fun main(){
  println("=== TEST SINGLETON ===")
  println("Status: ${DatabaseManager.connectionStatus}")
  DatabaseManager.connect()

  println("\n=== TEST COMPANION OBJECT ===")
  val client = NetworkClient.createClient()
  client.connect()

  println("\n=== TEST REGULAR CLASS ===")
  val reg1 = RegularUser("Clemens", 19)
  val reg2 = RegularUser("Clemens", 19)
  println(reg1)
  println("Sama? ${reg1 == reg2}")

  println("\n=== TEST DATA CLASS ===")
  val data1 = DataUser("Clemens", 19)
  val data2 = DataUser("Clemens", 19)
  println(data1)
  println("Sama? ${data1 == data2}")

  val data3 = data1.copy(age = 23)
  println("Hasil Copy: $data3")

  val (userName, userAge) = data1
  println("Destructured: $userName berumur $userAge")

  println("\n=== TEST SEALED CLASS ===")
  val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

  val uiMessage = when(response) {
    is ApiResponse.Success -> "Tampilkan: ${response.data}"
    is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    ApiResponse.Loading -> "Tampilkan Spinner"
  }
  GameManager.startGame() 
  GameManager.startGame() 

  println("Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")
  val StartSword = Weapon.forgeStarterSword()
  println(" Weapon: ${StartSword.item.name} \n Damage: ${StartSword.item.damage} \n Rarity: ${StartSword.item.rarity} \n Durability: ${StartSword.durability}")
  
  println("Hmmm, I need to upgrade my weapon...")
  val newSword = StartSword.item.copy(damage = 25)
  println("\nWelcome to the blacksmith! What can I do for you? \nNew Weapon: ${newSword.name} | Damage: ${newSword.damage} | Rarity: ${newSword.rarity}")

  processEvent(BattleState.SafeZone)
  processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
  processEvent(BattleState.LootDropped(newSword))
  processEvent(BattleState.GameOver("Terkena jebakan racun"))
}