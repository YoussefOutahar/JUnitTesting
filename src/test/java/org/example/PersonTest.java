package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testDisplayName() {
        Person person = new Person("John", "Doe",LocalDate.parse("2013-01-12"));
        System.out.println(person.displayName());
        assert person.displayName().equals("John Doe");
    }

    @Test
    void testGetAge() {
        Person person = new Person("Joey", "Doe", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(10, age);
    }
}
