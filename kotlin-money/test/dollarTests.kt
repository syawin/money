import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

fun testMultiplication() {
    val five = Dollar(5)
    assertEquals(Dollar(10), five.times(2))
    assertEquals(Dollar(15), five.times(3))
}

fun testEquality() {
    assertEquals(Dollar(5), Dollar(5))
    assertNotEquals(Dollar(5), Dollar(6))
}

fun main() {
    testMultiplication()
    testEquality()
}
