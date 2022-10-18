**Домашнее задание 2.3 часть 2**
Patterns - testmode

время на ручные тесты (Постмэн + ручной ввод): 40 минут;
время на автоматизацию: 600 минут

одно допущение: не репорчу, как баг, поскольку в ТЗ написано
"протестировать хотя бы функцию входа":
при успешном логине происходит переход на пустую страницу
http://localhost:9999/dashboard
всё же ожидаемый результат - http://localhost:9999/verification
(считаю правильным спросить, чтоб не репортить зря)

сборка падает - в тестах получаю 404:

java.lang.AssertionError: 1 expectation failed.
Expected status code <200> but was <404>.

тестовый режим, вроде включен

, хотя локально всё работает
[![Build status](https://ci.appveyor.com/api/projects/status/0vb8nk7swnwgec4u?svg=true)](https://ci.appveyor.com/project/naumshubaev/a232patterns)
