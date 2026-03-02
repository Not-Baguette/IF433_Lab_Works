package oop_00000105215_ClemensPutraKusmeri.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar Rp$amount berhasil menggunakan Credit Card [$accountName]")
            println("Sisa limit: Rp${limit - usedAmount}")
        } else {
            println("Transaksi ditolak: Melebihi limit kartu kredit")
        }
    }
}
