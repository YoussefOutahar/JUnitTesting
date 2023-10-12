package org.example;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Person {
    private final String givenName;
    private final String surname;

    private final LocalDate dateOfBirth;

    public Person(String givenName, String surname, LocalDate dateOfBirth) {
        this.givenName = givenName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    long getAge() {
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }

    String displayName() {
        return givenName + " " + surname;
    }

    @Override
    public String toString() {
        return "Person{" +
            "givenName='" + givenName + '\'' +
            ", surname='" + surname + '\'' +
            '}';
    }
}
