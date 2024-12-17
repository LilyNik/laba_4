package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testDivisionConstructorAndGetters() {
        Division division = new Division(1, "Sales");

        assertEquals(1, division.getId()); // Проверяем ID
        assertEquals("Sales", division.getName()); // Проверяем название
    }

    @Test
    public void testDivisionToString() {
        Division division = new Division(2, "Marketing");

        assertEquals("ID: 2, Name: Marketing", division.toString()); // Проверяем строковое представление
    }
}