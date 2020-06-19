# Электронная Школа
Веб-сайт проект "Электронная Школа".
Проект использует:

Spring Boot

Spring Web

Spring Security

Spring Security BCryptPasswordEncoder

Spring Validator

MySQL

MyBatis

Bootstrap

TestNG

Можно войти на страницу с учениками. Можно добавлять/удалять/изменять учеников.
Для базы данных я использовал MySQL Workbench.
# Установка и запуск
1)Чтобы скачать с гитхаба проект запускаем команду:
git clone https://github.com/nemesismj/E-schoolGreetGoRepo.git

2)Открываем проект с IntellijIDEA

3)Необходимо поднять MySQL базу со следующими учетными данными:

username root 

password root

//учетные данные вы можете поменять если не хотите создавать новый в application.properties

4)Прогнать скрипт initial.sql

5)Запускаем проект, **mvn spring-boot:run**

после запуска переходим в браузер по ссылке http://localhost:8080

6)Логинимся

login: admin

password: admin

7)И вы увидите основной функционал добавление, удаление, изменение

8)Тесты: Простой тест на основе TestNG.

**mvn test**

либо

Запускаете через файл по пути src\test\java\com\example\spring\StudentTest



