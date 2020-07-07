class Dollar(amount: Int, currency: String) : Money(amount, currency) {

    override fun times(multiplier: Int): Money =
            Money.dollar(amount * multiplier)

}
