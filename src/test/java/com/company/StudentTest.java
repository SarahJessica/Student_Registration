package com.company;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class StudentTest {


    @Test
    public void testSelfEqualsIsTrue() {
        Student self = new Student();
        assertEquals(self, self);
    }

    @Test
    @Ignore
    public void testTwoDifferentStudentsSameNullArgsNotEqualsIsTrue() {
        Student testStudent1 = new Student();
        Student testStudent2 = new Student();
        assertNotSame(testStudent1, testStudent2);

    }

    @Test
    @Ignore
    public void whenTheObjectPassedIsNullThenEqualsIsFalse() {
        Student firstStudent = new Student();
        firstStudent.setName("VAS");
        Student secondStudent = null;
        assertFalse(firstStudent.equals(secondStudent));
    }


    @Test
    @Ignore
    public void whenTwoStudentsHaveSameNameThenEqualsIsTrue() {
        Student testStudent1 = new Student();
        Student testStudent2 = new Student();
        testStudent1.setName("Jess");
        testStudent2.setName("Jess");

        "Jess".equals("Jess");
        assertEquals(testStudent1, testStudent2);
    }


}