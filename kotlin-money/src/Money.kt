class Money(val amount: Int, val currency: String) : Expression {

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
                && currency == money.currency
    }

    override fun times(multiplier: Int): Expression {
        return Money(amount * multiplier, currency)
    }

    override fun toString(): String {
        return "Money(amount=$amount, currency='$currency')"
    }

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
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
