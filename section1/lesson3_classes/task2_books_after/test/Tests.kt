import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    private val library = listOf(
        Book("Дюна", "Герберт", 1965),
        Book("Кобзарь", "Шевченко", 1840),
        Book("Мастер и Маргарита", "Булгаков", 1967),
    )

    @Test
    fun `booksAfter фильтрует и сортирует по году`() {
        assertEquals(
            listOf(Book("Дюна", "Герберт", 1965), Book("Мастер и Маргарита", "Булгаков", 1967)),
            booksAfter(library, 1900)
        )
    }

    @Test
    fun `booksAfter возвращает пустой список, если ничего не подходит`() {
        assertEquals(emptyList(), booksAfter(library, 2000))
    }
}
