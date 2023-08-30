Мои лабораторные работы для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - KSiS/КСиС (компьютерные системы и сети).

Для запуска и редактирования лабораторных работ потребуется среда разработки Kotlin и JDK. Подойдёт ***IntelliJ IDEA*** или ***Eclipse IDE + Kotlin Plugin***, а также ***JDK 1.8.0_382***.

<h2> Курсовая работа </h2>

Шахматы (клиенты и сервер) с GUI на Kotlin. Курсовая работа.

<h2> Лабораторная работа 1 </h2>

Написать программу, реализующую следующие функции: 

* Отображение MAC-адреса компьютера (можно воспользоваться функцией netbios). 
* Отображение всех рабочих групп, компьютеров в сети и их ресурсов (папок, открытых для общего доступа, принтеров). Воспользоваться функциями WNetXXX. 

<h2> Лабораторная работа 2 </h2>
Программа измеряет скорость передачи информации по протоколам TCP и UDP, а так же количество потерянных (искаженных) пакетов. 
Трафик генерируется псевдослучайным образом (т.е. генерируется псевдослучайная последовательность данных, отсылается на другой компьютер и там сравнивается с эталоном). 

<h2> Лабораторная работа 3 </h2>
Написать программу, реализующую следующие функции клиента и сервера одного из протоколов:

* DayTime

Программа должна производить полную обработку команд запросов и ответов каждого из протоколов.

<h2> Лабораторная работа 4 </h2>

Написать программу, реализующую функции FTP-сервера. В главном окне сервера расположено поле типа memo, в котором отображается весь протокол общения клиента с сервером, например: 

* USER vasilisa 
* 331 Password required for vasilisa. 
* PASS abcd 
* 230 User vasilisa logged in. 
* PORT 140,252,13,34,4,150 
* 200 PORT command successful. 

Тестирование и подача программы-сервера производится при помощи любого стандартного FTP клиента.
