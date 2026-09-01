# Проверка пароля

Заверши `isStrongPassword` — пароль считается надёжным, если одновременно:

- в нём хотя бы 8 символов;
- есть хотя бы одна цифра.

Примеры:
```
isStrongPassword("abc12345") -> true   (8 символов, есть цифра)
isStrongPassword("abcdefgh") -> false  (нет цифры)
isStrongPassword("a1")       -> false  (короче 8 символов)
isStrongPassword("")         -> false
```

<div class="hint" title="Как проверить, есть ли в строке цифра?">

У `String` есть метод `any { predicate }` — проверяет, нашёлся ли хоть один
символ, удовлетворяющий условию. А у `Char` есть `isDigit()`.

</div>
