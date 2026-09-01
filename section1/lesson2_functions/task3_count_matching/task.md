# Подсчёт по условию

Заверши `countMatching` — посчитай, сколько чисел из списка `scores`
удовлетворяют условию `predicate`. `predicate` — лямбда-параметр: функция,
принимающая `Int` и возвращающая `Boolean`.

Примеры:
```
countMatching(listOf(40, 55, 70, 90)) { it >= 60 } -> 2
countMatching(listOf(1, 2, 3, 4, 5)) { it % 2 == 0 } -> 2
countMatching(emptyList()) { it > 0 } -> 0
```

<div class="hint" title="Свой цикл или готовая функция?">

Свой цикл с `var`-счётчиком тоже пройдёт тесты, но у `List` уже есть метод
`count { predicate }`, который делает ровно это за одну строку.

</div>
