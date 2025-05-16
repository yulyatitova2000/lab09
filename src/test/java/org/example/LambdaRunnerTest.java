package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaRunnerTest {
    @Test
    public void runTest(){

        assertEquals(0,LambdaRunner.run(LambdaDemo.getLength, ""));
        assertEquals(1,LambdaRunner.run(LambdaDemo.getLength, "d"));
        assertEquals(2,LambdaRunner.run(LambdaDemo.getLength, "fp"));

        Student student1 = new Student("Petr", "Ivanov", "Ivanovich", 49, Gender.Male, "Math", "Dost","Pr" );
        Student student2 = new Student("Ivan", "Ivanov", "Ivanovich", 34, Gender.Male, "Math", "Dost","Pr" );
        Student student3 = new Student("Oleg", "Ivanov", "Ivanovich", 98, Gender.Male, "Math", "Dost","Pr" );

        assertTrue(LambdaDemo.isAllYoungerThat.apply(student1, student2, student3, 100));
        assertFalse(LambdaDemo.isAllYoungerThat.apply(student1, student2, student3,50));

        assertTrue(LambdaRunner.run(LambdaDemo.equalsLastName, student1, student2));


        assertTrue(LambdaRunner.run(LambdaDemo.isAllYoungerThat, student1, student2, student3, 100));
        assertFalse(LambdaRunner.run(LambdaDemo.isAllYoungerThat, student1, student2, student3,50));
    }


}