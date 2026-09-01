# Генератор скидки

Заверши `makeDiscount` — функция принимает процент скидки и **возвращает
функцию** (лямбду), которая применяет эту скидку к цене. Округление вниз
до целого.

Пример:
```
val tenPercentOff = makeDiscount(10)
tenPercentOff(200) -> 180
tenPercentOff(99)  -> 89

makeDiscount(0)(500)   -> 500
makeDiscount(100)(500) -> 0
```

<div class="hint" title="Как вернуть лямбду из функции?">

Тип возврата — сама функция: `fun makeDiscount(percent: Int): (Int) -> Int`.
Внутри верни лямбду, которая замыкает `percent`: `return { price -> ... }`.

</div>
