# Форматирование цены

Заверши `formatPrice` — собери строку `"<сумма> <валюта>"`. Если валюту не
передали, по умолчанию используется `"₽"`.

Примеры:
```
formatPrice(100)          -> "100 ₽"
formatPrice(50, "$")      -> "50 $"
formatPrice(amount = 20, currency = "€") -> "20 €"
```

<div class="hint" title="Как задать параметр по умолчанию?">

`fun formatPrice(amount: Int, currency: String = "₽"): String`.

</div>
