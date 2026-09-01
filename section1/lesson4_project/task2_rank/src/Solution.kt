/**
 * Участник чемпионата: имя и очки. Готовый data class, менять не нужно.
 */
data class Participant(val name: String, val points: Int)

/**
 * Отсортируй участников по очкам по убыванию; при равенстве очков —
 * по имени по возрастанию.
 */
fun rankParticipants(participants: List<Participant>): List<Participant> = TODO("реализуй")
