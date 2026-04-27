package oop_00000105215_ClemensPutraKusmeri.week10

fun main() {
  val coinRepo = WalletRepository<Coin>()
  coinRepo.add(Coin("BTC", 50000.0))
  coinRepo.add(Coin("ETH", 3000.0))
  coinRepo.add(Coin("USDT", 1.0))

  val response = ApiResponse("200 OK", coinRepo.getAll())
}
