import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `formatPrice подставляет валюту по умолчанию`() {
        assertEquals("100 ₽", formatPrice(100))
    }

    @Test
    fun `formatPrice принимает валюту позиционно и по имени`() {
        assertEquals("50 $", formatPrice(50, "$"))
        assertEquals("20 €", formatPrice(amount = 20, currency = "€"))
    }
}
