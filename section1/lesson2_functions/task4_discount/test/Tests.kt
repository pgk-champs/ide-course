import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `makeDiscount строит функцию скидки`() {
        val tenPercentOff = makeDiscount(10)
        assertEquals(180, tenPercentOff(200))
        assertEquals(89, tenPercentOff(99))
    }

    @Test
    fun `makeDiscount работает на краях 0 и 100 процентов`() {
        assertEquals(500, makeDiscount(0)(500))
        assertEquals(0, makeDiscount(100)(500))
    }
}
