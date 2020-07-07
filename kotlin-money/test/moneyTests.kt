import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

fun main() {
    testDollarMultiplication()
    testFrancMultiplication()
    testEquality()
    testCurrency()
    testSimpleAddition()
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

private fun testSimpleAddition() {
    val five = Money.dollar(5)
    val sum: Expression = five.plus(five)
    val bank = Bank()
    val reduced: Money = bank.reduce(sum, "USD")
    assertEquals(Money.dollar(10), reduced)
}
