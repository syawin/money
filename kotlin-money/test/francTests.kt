import kotlin.test.assertEquals

fun testFrancMultiplication() {
    val five = Franc(5)
    assertEquals(Franc(10), five.times(2))
    assertEquals(Franc(15), five.times(3))
}

fun main() {
    testFrancMultiplication()
}
