abstract class Money(val amount: Int, val currency: String) {

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && this.javaClass == money.javaClass
    }

    abstract fun times(multiplier: Int): Money

    companion object Factory {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Franc {
            return Franc(amount, "CHF")
        }
    }
}
