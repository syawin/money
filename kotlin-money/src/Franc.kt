class Franc(amount: Int) : Money(amount) {

    override fun times(multiplier: Int): Money =
            Franc(this.amount * multiplier)
}
