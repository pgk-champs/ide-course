import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Tests {
    @Test
    fun `isStrongPassword требует минимум 8 символов и хотя бы одну цифру`() {
        assertTrue(isStrongPassword("abc12345"))
        assertTrue(isStrongPassword("q1w2e3r4t5"))
        assertFalse(isStrongPassword("abcdefgh"))
        assertFalse(isStrongPassword("a1"))
        assertFalse(isStrongPassword(""))
    }
}
