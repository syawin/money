class Dollar(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money =
            Dollar(this.amount * multiplier)

}
