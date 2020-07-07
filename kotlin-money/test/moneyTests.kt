import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

fun main() {
    testDollarMultiplication()
    testFrancMultiplication()
    testEquality()
    testCurrency()
    testReduceSum()
    testPlusReturnsSum()
    testReduceMoney()
}

private fun testDollarMultiplication() {
    val five = Money.dollar(5)
    assertEquals(Money.dollar(10), five.times(2))
    assertEquals(Money.dollar(15), five.times(3))
}

private fun testFrancMultiplication() {
    val five = Money.franc(5)
    assertEquals(Money.franc(10), five.times(2))
    assertEquals(Money.franc(15), five.times(3))
}

private fun testEquality() {
    assertEquals(Money.dollar(5), Money.dollar(5))
    assertNotEquals(Money.dollar(5), Money.dollar(6))
    assertEquals(Money.franc(5), Money.franc(5))
    assertNotEquals(Money.franc(5), Money.franc(6))
    assertFalse(Money.dollar(5).equals(Money.franc(5)))
}

private fun testCurrency() {
    assertEquals("USD", Money.dollar(1).currency)
    assertEquals("CHF", Money.franc(1).currency)
}

private fun testPlusReturnsSum() {
    val five = Money.dollar(5)
    val result: Expression = five.plus(five)
    val sum: Sum = result as Sum
    assertEquals(five, sum.augend)
    assertEquals(five, sum.addend)
}

private fun testReduceSum() {
    val sum = Sum(Money.dollar(3), Money.dollar(4))
    val bank = Bank()
    val result: Money = bank.reduce(sum, "USD")
    assertEquals(Money.dollar(7), result)
}

private fun testReduceMoney() {
    val bank = Bank()
    val result = bank.reduce(Money.dollar(1),"USD")
    assertEquals(Money.dollar(1), result)
}
