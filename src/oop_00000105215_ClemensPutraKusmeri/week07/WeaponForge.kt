class Weapon private constructor(val item: GameItem, val durability: Int){
  companion object{
    fun forgeStarterSword(): Weapon{
      return Weapon(item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), durability = 50)
    }
    fun forgeEpicSword(): Weapon{
      return Weapon(item = GameItem("Pedang Fredrin emelbebe", 300, ItemRarity.EPIC), durability = 100)
    }

  }
}