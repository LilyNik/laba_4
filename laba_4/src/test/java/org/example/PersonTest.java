package org.example;

import org.junit.Test;

import java.util.Date;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPersonConstructorAndGetters() throws Exception {
        Division division = new Division(1, "Sales");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = format.parse("01.01.1990");

        Person person = new Person(1, "John Doe", "Male", division, 55000, dateOfBirth);

        assertEquals(1, person.getId()); // Проверяем ID
        assertEquals("John Doe", person.getName()); // Проверяем имя
        assertEquals("Male", person.getGender()); // Проверяем пол
        assertEquals(division, person.getDivision()); // Проверяем подразделение
        assertEquals(55000, person.getSalary(), 0); // Проверяем зарплату
        assertEquals(dateOfBirth, person.getDateOfBirth()); // Проверяем дату рождения
    }

    @Test
    public void testPersonToString() throws Exception {
        Division division = new Division(3, "HR");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = format.parse("02.02.1988");

        Person person = new Person(2, "Jane Smith", "Female", division, 60000, dateOfBirth);

        String expectedOutput = "ID: 2, Name: Jane Smith, Gender: Female, Division: [ID: 3, Name: HR], Salary: 60000.0, Date of Birth: " + dateOfBirth;
        assertEquals(expectedOutput, person.toString()); // Проверяем строковое представление
    }
}