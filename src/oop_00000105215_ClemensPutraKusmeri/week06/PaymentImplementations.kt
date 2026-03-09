package oop_00000105215_ClemensPutraKusmeri.week06

class Gopay: PaymentMethod{
  override fun pay(amount: Double){ println("Processing Rp$amount via Gopay server")) }
}

class CreditCard: PaymentMethod{
  override fun pay(amount: Double){ println("Contacting Bank for Rp$amount")}
}