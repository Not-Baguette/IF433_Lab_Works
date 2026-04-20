package oop_00000105215_ClemensPutraKusmeri.week09

fun main(){
  val tradeHistory = listOf(
    TradeLog("BTCUSDT", "LONG", 1000, 500.0, "OPEN"),
    TradeLog("BTCUSDT", "SHORT", 2000, -1000.0, "CLOSED"),
    TradeLog("ETHUSDT", "SHORT", 3000, 500.0, "OPEN"),
    TradeLog("BTCUSDT", "SHORT", 4000, 100.0, "CLOSED"),
    TradeLog("BTCUSDT", "LONG", 5000, -500.0, "OPEN"),
    TradeLog("BTCUSDT", "LONG", 2200, -1000.0, "CLOSED")
  )

  val closedTrades = tradeHistory
      .filter{it.status == "CLOSED"}
  val winningTrades = closedTrades.filter{it.roe > 0}
  val losingTrades = closedTrades.filter{it.roe <= 0}
  println("$closedTrades")
}