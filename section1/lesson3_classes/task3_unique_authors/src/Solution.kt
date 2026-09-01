/**
 * Книга: название, автор, год издания. Готовый data class, менять не нужно.
 */
data class Book(val title: String, val author: String, val year: Int)

/**
 * Верни набор имён авторов без повторов.
 */
fun uniqueAuthors(books: List<Book>): Set<String> = TODO("реализуй")
