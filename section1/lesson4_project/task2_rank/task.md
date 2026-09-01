# Ранжирование участников

Заверши `rankParticipants` — отсортируй участников по очкам по убыванию.
Если у двух участников очки равны, тот, чьё имя раньше по алфавиту, идёт
первым.

Пример:
```
rankParticipants(listOf(
    Participant("Ваня", 10),
    Participant("Аня", 15),
    Participant("Игорь", 15),
)) -> [Participant("Аня", 15), Participant("Игорь", 15), Participant("Ваня", 10)]
```

<div class="hint" title="Сортировка сразу по двум критериям">

`sortedWith(compareByDescending<Participant> { it.points }.thenBy { it.name })`
сортирует сначала по очкам по убыванию, а при равенстве — по имени по
возрастанию.

</div>
