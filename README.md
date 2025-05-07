Pet Shelter — Практика з Generics та принципом PECS
Цей проєкт демонструє використання дженеріків у Java разом із принципом PECS (Producer Extends, Consumer Super).
Він імітує роботу притулку для тварин, який приймає, зберігає та взаємодіє з різними видами домашніх улюбленців.

Структура проєкту
Pet (абстрактний клас) — базовий клас для усіх тварин. Має метод speak().

Cat, Dog, Parrot — підкласи, що реалізують поведінку тварин.

PetProducer<T extends Pet> — інтерфейс, який повертає список тварин (producer).

PetShelter<T extends Pet> — клас, який "споживає" тварин і викликає їхні методи (consumer).

Main — клас з методом main(), який ініціалізує продуцентів та передає тварин до шелтера.

Основна ідея: PECS
Producer — використовує ? extends T
Наприклад: List<? extends T> producePets()

Ми читаємо елементи, але не змінюємо їх.

Consumer — використовує ? super T
Наприклад: void feedAll(List<? super T> pets)

Ми можемо додавати або передавати елементи.

Як запустити
Склонуйте репозиторій або відкрийте у своєму IDE (наприклад IntelliJ IDEA).

Запустіть клас Main.

Вивід у консолі покаже як "годуються" тварини з різних шелтерів.

Приклад виводу

Feeding dogs:
Rex says: Woof!
Puppy says: Woof!
Paw says: Woof!

Feeding cats:
Kitty says: Meow!
Mittens says: Meow!
Maria says: Meow!

Feeding parrots:
Kiki says: skr-skr
Bird says: skr-skr
Patty says: skr-skr

Висновок
Цей проєкт — чудовий приклад практичного застосування дженеріків у Java та правильного розуміння PECS.
Корисно для підготовки до інтерв'ю або як база для складніших задач із типізацією в Java.

Автор
Ірина Кравченко - kravchenko1207
