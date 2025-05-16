package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaDemoTest {
    @Test
    public void getLengthTest(){

        assertEquals(0,LambdaDemo.getLength.apply(""));
        assertEquals(1,LambdaDemo.getLength.apply("q"));
        assertEquals(2,LambdaDemo.getLength.apply("sl"));
    }

    @Test
    public void firstCharTest(){
        assertEquals(null, LambdaDemo.firstChar.apply(""));
        assertEquals('d', LambdaDemo.firstChar.apply("dkfl"));
        assertEquals('h', LambdaDemo.firstChar.apply("hdoi"));

    }

    @Test
    public void isDoesNotContainsSpacesTest(){
        assertFalse(LambdaDemo.isDoesNotContainsSpaces.apply("dmv os"));
        assertTrue(LambdaDemo.isDoesNotContainsSpaces.apply("dldpw"));
    }

    @Test
    public void getWordsCountTest(){
        assertEquals(0, LambdaDemo.getWordsCount.apply(""));
        assertEquals(2, LambdaDemo.getWordsCount.apply("dls,skf"));
    }

    @Test
    public void getAgeTest(){
        Student student = new Student("Ivan", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        assertEquals(34, LambdaDemo.getAge.apply(student));
    }
    @Test
    public void equalsLastNameTest(){
        Student student1 = new Student("Petr", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        Student student2 = new Student("Ivan", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );

        assertTrue(LambdaDemo.equalsLastName.test(student1, student2));
    }

    @Test
    public void getFullNameTest(){
        Student student1 = new Student("Petr", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        assertEquals("Ivanov Petr Ivanovich", LambdaDemo.getFullName.apply(student1));
    }

    @Test
    public void incrementAgeTest(){
        Student student1 = new Student("Petr", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        assertEquals(35, LambdaDemo.incrementAge.apply(student1).getAge());
    }

    @Test
    public void isAllYoungerThatTest(){
        Student student1 = new Student("Petr", "Ivanov", "Ivanovich", 49, Gender.Male, "Math", "Dost","Pr" );
        Student student2 = new Student("Ivan", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        Student student3 = new Student("Oleg", "Ivanov", "Ivanovich", 98, Gender.Male, "Math", "Dost","Pr" );

        assertTrue(LambdaDemo.isAllYoungerThat.apply(student1, student2, student3, 100));
        assertFalse(LambdaDemo.isAllYoungerThat.apply(student1, student2, student3,50));
    }


}