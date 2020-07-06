data class Dollar(val amount: Int) {

    fun times(multiplier: Int): Dollar =
            Dollar(this.amount * multiplier)
}
