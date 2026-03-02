package oop_00000105215_ClemensPutraKusmeri.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
