package org.example;

import java.util.Objects;

public class Student extends Human{
    private String faculty;
    private String university;
    private String specialization;

    public Student(String firstName, String lastName, String surName, int age, Gender gender, String faculty, String university, String specialization) {
        super(firstName, lastName, surName, age, gender);
        this.faculty = faculty;
        this.university = university;
        this.specialization = specialization;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Student student = (Student) object;
        return Objects.equals(faculty, student.faculty) && Objects.equals(university, student.university) && Objects.equals(specialization, student.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculty, university, specialization);
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", university='" + university + '\'' +
                ", specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}
