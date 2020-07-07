class Franc(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Franc =
            Franc(this.amount * multiplier)
}
