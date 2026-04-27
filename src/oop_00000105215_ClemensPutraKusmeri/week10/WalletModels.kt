package oop_00000105215_ClemensPutraKusmeri.week10

data class Coin(override val name: String, val balance: Double) : HasName

data class Transaction(override val name: String, val amount: Double) : HasName