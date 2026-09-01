import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Tests {
    @Test
    fun `topScorer возвращает имя лидера по очкам`() {
        assertEquals("Аня", topScorer(listOf(Participant("Аня", 15), Participant("Ваня", 10))))
    }

    @Test
    fun `topScorer для пустого списка возвращает null`() {
        assertNull(topScorer(emptyList()))
    }
}
