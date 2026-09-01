import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `rankParticipants сортирует по очкам, при равенстве - по имени`() {
        val participants = listOf(
            Participant("Ваня", 10),
            Participant("Аня", 15),
            Participant("Игорь", 15),
        )
        assertEquals(
            listOf(Participant("Аня", 15), Participant("Игорь", 15), Participant("Ваня", 10)),
            rankParticipants(participants)
        )
    }

    @Test
    fun `rankParticipants для пустого списка возвращает пустой список`() {
        assertEquals(emptyList(), rankParticipants(emptyList()))
    }
}
