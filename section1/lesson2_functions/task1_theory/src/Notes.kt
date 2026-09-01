// Живые примеры к главе "Функции и лямбды". Запусти main() и посмотри вывод.

fun greet(name: String = "гость"): String = "Привет, $name!"

fun main() {
    println(greet())                 // параметр по умолчанию
    println(greet(name = "Аня"))     // именованный аргумент

    val double: (Int) -> Int = { x -> x * 2 }   // лямбда, сохранённая в переменную
    println(double(21))

    val numbers = listOf(1, 2, 3, 4, 5)
    val evenCount = numbers.count { it % 2 == 0 }   // count — функция высшего порядка
    println("Чётных чисел: $evenCount")
}
