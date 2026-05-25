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

interface CustomerDiscountStrategy {
    fun calculatePrice(basePrice: Double): Double
}

class RegularDiscount : CustomerDiscountStrategy {
    override fun calculatePrice(basePrice: Double) = basePrice
}

class VipDiscount : CustomerDiscountStrategy {
    override fun calculatePrice(basePrice: Double) = basePrice * 0.90
}

class EcommerceOrderProcessor(
    private val storage: OrderStorage,
    private val notification: NotificationService,
    private val discountStrategy: CustomerDiscountStrategy
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // FIXED OCP: Menggunakan strategy untuk kalkulasi harga
        val finalPrice = discountStrategy.calculatePrice(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        // FIXED SRP/DIP: Menggunakan abstraction untuk storage dan notifikasi
        storage.save(itemName, finalPrice, customerType)
        notification.notify(itemName)
    }
}
