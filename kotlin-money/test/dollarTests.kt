import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

fun testMultiplication() {
    val five = Dollar(5)
    val ten = five.times(2)
    val fifteen = five.times(3)
    assertEquals(10, ten.amount)
    assertEquals(15, fifteen.amount)
}

fun testEquality() {
    assertEquals(Dollar(5), Dollar(5))
    assertNotEquals(Dollar(5), Dollar(6))
}

fun main() {
    testMultiplication()
    testEquality()
}
