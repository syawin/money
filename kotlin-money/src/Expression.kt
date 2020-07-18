interface Expression {
    fun reduce(bank: Bank, to: String): Money

    fun plus(added: Expression): Expression

    //@todo Expression.times
}
