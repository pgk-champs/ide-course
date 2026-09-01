import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `uniqueAuthors убирает повторы авторов`() {
        val library = listOf(
            Book("Дюна", "Герберт", 1965),
            Book("Мессия Дюны", "Герберт", 1969),
            Book("Кобзарь", "Шевченко", 1840),
        )
        assertEquals(setOf("Герберт", "Шевченко"), uniqueAuthors(library))
    }

    @Test
    fun `uniqueAuthors для пустого списка возвращает пустой набор`() {
        assertEquals(emptySet(), uniqueAuthors(emptyList()))
    }
}
