import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

private fun testDollarMultiplication() {
    val five = Money.dollar(5)
    assertEquals(Dollar(10), five.times(2))
    assertEquals(Dollar(15), five.times(3))
}

private fun testFrancMultiplication() {
    val five = Money.franc(5)
    assertEquals(Franc(10), five.times(2))
    assertEquals(Franc(15), five.times(3))
}

private fun testEquality() {
    assertEquals(Dollar(5), Dollar(5))
    assertNotEquals(Dollar(5), Dollar(6))
    assertEquals(Franc(5), Franc(5))
    assertNotEquals(Franc(5), Franc(6))
    assertFalse(Dollar(5).equals(Franc(5)))
}

fun main() {
    testDollarMultiplication()
    testFrancMultiplication()
    testEquality()
}
