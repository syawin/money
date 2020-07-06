import kotlin.test.assertEquals

fun testMultiplication() {
    val five = Dollar(5)
    val ten = five.times(2)
    val fifteen = five.times(3)
    assertEquals(10, ten.amount)
    assertEquals(15, fifteen.amount)
}

fun main() {
    testMultiplication()
}
