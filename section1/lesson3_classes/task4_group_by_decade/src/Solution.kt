/**
 * Книга: название, автор, год издания. Готовый data class, менять не нужно.
 */
data class Book(val title: String, val author: String, val year: Int)

/**
 * Сгруппируй книги по десятилетию издания. Ключ — строка вида "1960-е".
 */
fun groupByDecade(books: List<Book>): Map<String, List<Book>> = TODO("реализуй")
