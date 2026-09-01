import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `groupByDecade группирует книги по десятилетию`() {
        val library = listOf(
            Book("Дюна", "Герберт", 1965),
            Book("Мессия Дюны", "Герберт", 1969),
            Book("Кобзарь", "Шевченко", 1840),
        )
        val expected = mapOf(
            "1960-е" to listOf(Book("Дюна", "Герберт", 1965), Book("Мессия Дюны", "Герберт", 1969)),
            "1840-е" to listOf(Book("Кобзарь", "Шевченко", 1840)),
        )
        assertEquals(expected, groupByDecade(library))
    }

    @Test
    fun `groupByDecade для пустого списка возвращает пустую карту`() {
        assertEquals(emptyMap(), groupByDecade(emptyList()))
    }
}
