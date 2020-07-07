abstract class Money(val amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && this.javaClass == money.javaClass
    }

    abstract fun times(multiplier: Int): Money

    companion object Factory {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }
}
