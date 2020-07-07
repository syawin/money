class Money(val amount: Int, val currency: String) : Expression {

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && currency == money.currency
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun toString(): String {
        return "Money(amount=$amount, currency='$currency')"
    }

    fun plus(addend: Money): Expression {
        return Money(amount + addend.amount, currency)
    }

    companion object Factory {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}
