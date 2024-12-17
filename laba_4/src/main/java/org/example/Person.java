package org.example;

import java.util.Date;

public class Person {
    // Поля (атрибуты) класса Person
    private final int id;                    // Уникальный идентификатор человека
    private final String name;               // Имя человека
    private final String gender;             // Пол человека
    private final Division division;         // Подразделение, к которому принадлежит человек
    private final double salary;              // Зарплата человека
    private final Date dateOfBirth;          // Дата рождения человека

    // Конструктор класса Person
    public Person(int id, String name, String gender, Division division, double salary, Date dateOfBirth) {
        this.id = id;                          // Инициализация идентификатора
        this.name = name;                      // Инициализация имени
        this.gender = gender;                  // Инициализация пола
        this.division = division;              // Инициализация подразделения
        this.salary = salary;                  // Инициализация зарплаты
        this.dateOfBirth = dateOfBirth;       // Инициализация даты рождения
    }

    // Геттеры для доступа к приватным полям
    public int getId() {
        return id;                             // Возвращаем идентификатор
    }

    public String getName() {
        return name;                           // Возвращаем имя
    }

    public String getGender() {
        return gender;                         // Возвращаем пол
    }

    public Division getDivision() {
        return division;                       // Возвращаем подразделение
    }

    public double getSalary() {
        return salary;                         // Возвращаем зарплату
    }

    public Date getDateOfBirth() {
        return dateOfBirth;                    // Возвращаем дату рождения
    }

    // Метод для получения строкового представления объекта Person
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Gender: " + gender +
                ", Division: [" + division + "]" +  // Включаем строковое представление подразделения
                ", Salary: " + salary +
                ", Date of Birth: " + dateOfBirth; // Включаем дату
    }
}