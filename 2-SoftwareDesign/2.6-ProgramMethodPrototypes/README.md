### Прототипи методів програмних класів

FR    |Опис вимоги   |Назва класу |Назва методу класу|
|:-    |:-            |:-          |:-                |
| FR1.1 | Користувач надає ПП своє місцезнаходження та радіус пошуку | Consumer | sendLocation(Location, integer)|
| FR1.2 | ПП знаходить інформацію щодо рівня освітленності у регіоні| Illumitation | parseData(Location)|
| FR1.3 | Користувач отримає інформацію про рівень освітленності | Illumitation | getIlluminationAndTime()|
| FR2.1 | Користувач надає ПП своє місцезнаходження | Consumer | sendLocation(Location)|
| FR2.2 | ПП знаходить найближчі зали коло користувачаа | Google maps api | getGym(Location)|
| FR2.3 | користувач отримує карту з розташуванням найближчих залів | Google maps api | sendLocation()|
