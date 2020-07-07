class Franc(amount: Int, currency: String) : Money(amount, currency) {

    override fun times(multiplier: Int): Money =
            Money.franc(amount * multiplier)
}
