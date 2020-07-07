import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

private fun testFrancMultiplication() {
    val five = Franc(5)
    assertEquals(Franc(10), five.times(2))
    assertEquals(Franc(15), five.times(3))
}

private fun testEquality() {
    assertEquals(Franc(5), Franc(5))
    assertNotEquals(Franc(5), Franc(6))
}

fun main() {
    testFrancMultiplication()
    testEquality()
}
