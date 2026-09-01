import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `secondsToClock форматирует время как Ч-ММ-СС`() {
        assertEquals("0:00:00", secondsToClock(0))
        assertEquals("0:00:59", secondsToClock(59))
        assertEquals("0:01:01", secondsToClock(61))
        assertEquals("1:01:01", secondsToClock(3661))
        assertEquals("2:02:05", secondsToClock(7325))
    }
}
