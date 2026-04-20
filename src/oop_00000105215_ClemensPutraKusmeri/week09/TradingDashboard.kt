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

  println("=== CRYPTO TRADING DASHBOARD ===")
  
  val topPerformersString = winningTrades
      .sortedByDescending {it.roe}
      .map {"WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}
  println("\n--- Top Performers ---")
  topPerformersString.forEach { println(it) }

  val worstPerformersString = losingTrades
      .sortedBy {it.roe}
      .map {"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"}
  println("\n=== Worst Performers ===") 
  worstPerformersString.forEach { println(it) }

  val uniquePairs = tradeHistory
      .map { it.pair }
      .toSet()
  println("\n=== Unique Trading Pairs ===")
  println("Pasangan yang pernah ditradingkan: $uniquePairs")
} 
// aman