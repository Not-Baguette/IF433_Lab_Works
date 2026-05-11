package oop_00000105215_ClemensPutraKusmeri.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    
    if (isJammed) {
        throw DispenserJamException()
    }
    
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    // Jadwal Makan 1
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Error: Dispenser macet! ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Error: Stok habis! ${e.message}")
    } catch (e: Exception) {
        println("Caught Error: Terjadi kesalahan sistem. ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}
