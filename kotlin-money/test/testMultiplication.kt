import kotlin.test.assertEquals

fun testMultiplication() {
    val five = Dollar(5)
    five.times(2)
    assertEquals(10, five.amount)
}

fun main() {
    testMultiplication()
}
