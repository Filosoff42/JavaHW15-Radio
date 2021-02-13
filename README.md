# Задача №2 - "Цикломатическая сложность кода"
## Формула вычисления количества unit-тестов:
Чтобы определить количество unit-тестов, необходимое для максимального покрытия кода на основе счётчика цикломатической сложности в JaCoCo (`COMPLEXITY`), необходимо вычесть 1 из получившегося значения цикломатической сложности в отчёте JaCoCo.
> **Примечание:** мы вычитаем единицу, т.к. минимальное значение цикломатической сложности равно 1, т.е. если исходный код не содержит никаких точек ветвления или циклов. Цикломатическая сложность повышается (значение увеличивается), когда в коде появляются операторы, добавляющие маршруты, например `if`. Каждый оператор `if` подразумевает 2 маршрута (когда условие выполняется и когда нет), т.е. добавляет 1 точку ветвления, соответственно каждый оператор `if` в коде повышает цикломатическую сложность на 1.

Таким образом, необходимая формула будет выглядеть так:

`U = C - 1`

где U - искомое количество unit-тестов, C - цикломатическая сложность.

По условиям задачи необходимо проверить, соответствует ли количество unit-тестов для методов, обрабатывающих `next` и `prev`, искомому значению U.
В моей программе `next` и `prev` обрабатываются одним методом `setCurrentStationWithButton`. Обратимся к отчёту JaCoCo:

![Report](https://d3dehtdmp2rwcw.cloudfront.net/ms_330212/UVHgsH8WS4UvFt3UsN3gvlt9TBjNGH/Radio%2B%2528%25D1%2584%25D0%25BE%25D1%2580%25D0%25BC%25D1%2583%25D0%25BB%25D0%25B0%2529.png?Expires=1613235600&Signature=oQWrZm7fjS8IFSXfD1TuzKtwfgHjWAMCGGkCsIsIEQdTMTu49t4QfGPFElnxncPSTIUktzrLhqTdyI4BQK1iUD8C12YNtgG1mGe5iUnLqlPPWKHghz0Y810I1E7V7degadYFjjPL3nn8YYrdeOEpgmdtoLEcxGinYcFx7HlV4FG~5bhJJoJEtH8dGYeAwK51val3h3a1lFXhj~f2MdAJjpyR9NxG3NkfcKNj0HuPYU8hXNlpsqG7IevA2XPzWS4Fr0dETfMwIzegm-spOmnZUCLFJYZhHJv~TtjXq38YkJoFUvt~l04sdeEa7-AIlGMuqogeEn2f6PORluNupX6uJg__&Key-Pair-Id=APKAJBCGYQYURKHBGCOA)

Мы видим, что цикломатическая сложность данного метода равна 5. Соответственно, согласно формуле выше, необходимое количество unit-тестов (U) будет равно 4.

Следуя условиям задачи, удостоверимся дополнительно (не глядя в отчёт JaCoCo), что для метода `setCurrentStationWithButton` количество моих unit-тестов совпадает с рекомендациями метрики. Тестов должно быть 4, в моём коде тестов на данный метод также 4:
- `shouldSetCurrentStationWithButtonIfNext`
- `shouldSetCurrentStationWithButtonIfPrev`
- `shouldSetCurrentStationWithButtonIf9AndNext`
- `shouldSetCurrentStationWithButtonIf0AndPrev`

## Рекомендуемый порог цикломатической сложности кода:
У цикломатической сложности кода нет максимального значения как такового. Тем не менее, автор формулы расчёта цикломатической сложности Томас Дж. Маккейб при написании программ рекомендует не превышать значение цикломатической сложности отдельных модулей (методов), равное **10**. Данный рекомендуемый порог считается общепринятым.
>**Цитата из Википедии:** "Одно из первоначально предложенных Маккейбом применений состоит в том, что необходимо ограничивать сложность программ во время их разработки. Он рекомендует, чтобы программистов обязывали вычислять сложность разрабатываемых ими модулей и разделять модули на более мелкие всякий раз, когда цикломатическая сложность этих модулей превысит десять. Эта практика была включена НИСТ-ом в методику структурного тестирования с замечанием, что со времени исходной публикации Маккейба выбор значения 10 получил весомые подтверждения, однако в некоторых случаях может быть целесообразно ослабить ограничение и разрешить модули со сложностью до 15. В данной методике признаётся, что иногда могут существовать причины для выхода за рамки согласованного лимита. Это сформулировано как рекомендация: «Для каждого модуля следует либо ограничивать цикломатическую сложность до согласованных пределов, либо предоставить письменное объяснение того, почему лимит был превышен»." 