open class Money(val amount: Int) {
    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && this.javaClass == money.javaClass
    }
}
