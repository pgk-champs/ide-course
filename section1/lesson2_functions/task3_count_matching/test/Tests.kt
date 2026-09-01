import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `countMatching считает числа, удовлетворяющие условию`() {
        assertEquals(2, countMatching(listOf(40, 55, 70, 90)) { it >= 60 })
        assertEquals(2, countMatching(listOf(1, 2, 3, 4, 5)) { it % 2 == 0 })
        assertEquals(0, countMatching(emptyList()) { it > 0 })
        assertEquals(5, countMatching(listOf(1, 2, 3, 4, 5)) { it > 0 })
    }
}
