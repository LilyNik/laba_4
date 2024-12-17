package org.example;

public class Division {
    // Поля (атрибуты) класса Division
    private final int id;
    private final String name;

    // Конструктор класса Division
    public Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Геттер для получения идентификатора
    public int getId() {
        return id;
    }

    // Геттер для получения названия
    public String getName() {
        return name;
    }

    // Метод для получения строкового представления объекта Division
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name; // Формируем строку с информацией о подразделении
    }
}