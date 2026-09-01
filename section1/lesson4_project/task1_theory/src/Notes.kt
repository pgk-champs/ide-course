// Демонстрация приёмов, которые пригодятся в следующих трёх заданиях.

data class Team(val name: String, val wins: Int)

fun bestTeamName(teams: List<Team>): String? =
    teams.maxByOrNull { it.wins }?.name   // ?. и maxByOrNull — на случай пустого списка

fun main() {
    val teams = listOf(Team("Волга-IT", 5), Team("РуКод", 7))
    println("Лидер: ${bestTeamName(teams) ?: "пока нет данных"}")
    println("Лидер (пустой список): ${bestTeamName(emptyList()) ?: "пока нет данных"}")
}
