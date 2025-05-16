package org.example;

import java.util.Objects;

public class Human {
    private String firstName;
    private String lastName;
    private String surName;
    private int age;
    private Gender gender;

    public Human(String firstName, String lastName, String surName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Human human = (Human) object;
        return age == human.age && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(surName, human.surName) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, surName, age, gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                '}';
    }
}