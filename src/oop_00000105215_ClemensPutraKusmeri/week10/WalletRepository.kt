class WalletRepository<T: Any>{
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
    fun findByName(name: String): T? {
        return items.find {it.name.equals(name, ignoreCase = true)}
    }
}