import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `formatScoreboard нумерует участников по убыванию очков`() {
        val participants = listOf(Participant("Ваня", 10), Participant("Аня", 15))
        assertEquals("1. Аня — 15\n2. Ваня — 10", formatScoreboard(participants))
    }

    @Test
    fun `formatScoreboard при равенстве очков сортирует по имени`() {
        val participants = listOf(Participant("Игорь", 15), Participant("Аня", 15))
        assertEquals("1. Аня — 15\n2. Игорь — 15", formatScoreboard(participants))
    }

    @Test
    fun `formatScoreboard для пустого списка возвращает пустую строку`() {
        assertEquals("", formatScoreboard(emptyList()))
    }
}
