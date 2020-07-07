class Dollar(amount: Int) : Money(amount) {

    fun times(multiplier: Int): Dollar =
            Dollar(this.amount * multiplier)

}
