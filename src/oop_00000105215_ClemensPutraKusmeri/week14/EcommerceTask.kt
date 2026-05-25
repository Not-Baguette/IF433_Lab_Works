package oop_00000105215_ClemensPutraKusmeri.week14

import java.io.File

interface OrderStorage {
    fun save(itemName: String, finalPrice: Double, customerType: String)
}

class FileOrderStorage : OrderStorage {
    private val file = File("orders.csv")
    override fun save(itemName: String, finalPrice: Double, customerType: String) {
        file.appendText("$itemName,$finalPrice,$customerType\n")
    }
}

interface NotificationService {
    fun notify(itemName: String)
}

class EmailNotificationService : NotificationService {
    override fun notify(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekali
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}
