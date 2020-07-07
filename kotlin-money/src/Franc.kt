data class Franc(val amount: Int) {

    fun times(multiplier: Int): Franc =
            Franc(this.amount * multiplier)
}
