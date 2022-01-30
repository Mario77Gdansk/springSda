package com.example.demo.module.home;

public class PersonDto {
    private final String name;
    private final String surname;
    private final int age;

    public PersonDto(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
