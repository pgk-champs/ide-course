import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `celsiusToFahrenheit переводит градусы верно`() {
        assertEquals(32.0, celsiusToFahrenheit(0.0))
        assertEquals(212.0, celsiusToFahrenheit(100.0))
        assertEquals(-40.0, celsiusToFahrenheit(-40.0))
    }
}
