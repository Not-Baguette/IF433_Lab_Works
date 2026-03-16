package oop_00000105215_ClemensPutraKusmeri.week07

fun processEvent(event: BattleState){
  when(event){
    is BattleState.MonsterEncounter -> {
      println("A monster appears named ${event.monsterName}!")
    }
    is BattleState.LootDropped -> {
      println("Congratulations! You've earned ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}")
    }
    is BattleState.GameOver -> {
      val (reason) = event
      println("Game Over! You $reason")
    }
    BattleState.SafeZone -> {
      println("Safe Zone! You're safe")
    }
  }
}