<h1>Домашнее задание №2 - Разработать классы Ночной клуб и Фейсконтролер</h1>

<h3>Подключенные зависимости:</h3>
<ul><li>org.junit:junit-bom:5.10.0</li>
<li>org.junit.jupiter:junit-jupiter</li>
<li>org.junit.jupiter:junit-jupiter-api</li>
<li>org.junit.jupiter:junit-jupiter-engine</li>
<li>org.junit.jupiter:junit-jupiter-params</li>
<li>org.assertj:assertj-core:3.27.0</li>
<li>org.mockito:mockito-core:5.15.2</li>
<li>org.mockito:mockito-junit-jupiter:5.15.2</li></ul>

Реализовано 2 класса NightClub - ночной клуб и FaceControl - фейсконтролер.
FaceControl является зависимостью NightClub и отвечает за проверку задолжности посетителя и проверку стиля одежды.
NightClub отвечает за проверку численности в клубе и проверку в рамках дня недели(используются в числовом варианте от 1 до 7)
В случае положительного результата NightClub увеличивает или уменьшает численность посетителей на 1 единицу

Помимо реализации 2 классов были реализованы тесты(в каталоге src/test/java/hw02_HightClubProject/) которые дали положительный результат

<h3>Тесты:</h3>
<ul><li>Должен впустить человека в стиле Ретро или Эко-стиль вне зависимости от дня недели</li>
<li>Не должен впускать человека в классическом</li>
<li>Не должен впускать человека в заполненный клуб</li>
<li>Не должен выпускать человека с долгами</li></ul>


   
