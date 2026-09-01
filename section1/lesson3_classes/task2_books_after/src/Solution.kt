/**
 * Книга: название, автор, год издания. Готовый data class, менять не нужно.
 */
data class Book(val title: String, val author: String, val year: Int)

/**
 * Оставь книги, изданные в году year или позже, отсортированные по году по возрастанию.
 */
fun booksAfter(books: List<Book>, year: Int): List<Book> = TODO("реализуй")
