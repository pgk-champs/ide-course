// Живые примеры к главе "Переменные и типы". Запусти main() и посмотри вывод.

fun main() {
    val name = "Аня"           // val — присваивается один раз
    var score = 0               // var — можно менять
    score += 10
    println("Игрок: $name, очки: $score")

    val price: Double = 199.0
    val count = 3
    println("Итого: ${price * count}")

    val wholeDivision = 5 / 2       // Int / Int = Int, дробная часть отбрасывается
    val realDivision = 5.0 / 2      // Double / Int = Double
    println("5 / 2 = $wholeDivision, но 5.0 / 2 = $realDivision")
}
