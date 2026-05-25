package oop_00000105215_ClemensPutraKusmeri.week14

interface DiscountStrategy {
    fun applyDiscount(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun applyDiscount(price: Double): Double {
        return price * 0.80
    }
}

class MemberDiscount : DiscountStrategy {
    override fun applyDiscount(price: Double): Double {
        return price * 0.85
    }
}
