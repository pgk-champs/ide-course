// Живые примеры к главе "Классы и коллекции". Запусти main() и посмотри вывод.

data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val library = listOf(
        Book("Кобзарь", "Шевченко", 1840),
        Book("Мастер и Маргарита", "Булгаков", 1967),
        Book("Дюна", "Герберт", 1965),
    )

    val newBooks = library.filter { it.year >= 1900 }.sortedBy { it.year }
    println("Книги после 1900: ${newBooks.map { it.title }}")

    val byAuthor = library.groupBy { it.author }
    println("По авторам: ${byAuthor.keys}")

    for (book in library) {
        val age = when {
            book.year < 1900 -> "классика"
            book.year < 2000 -> "XX век"
            else -> "современная"
        }
        println("${book.title}: $age")
    }
}
