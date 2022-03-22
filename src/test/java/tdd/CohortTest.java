package tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class CohortTest {


    @Test
    public void testCohortConstructor(){
        Cohort c1 = new Cohort();
        Student cs1 = new Student();
        assertNotNull(c1);
        c1.addStudent(cs1);
        assertEquals(1, c1.getStudents().size());
    }

    @Test
    public void testAddStudent(){
        Cohort c1 = new Cohort();
        Student sss = new Student(5,"Jimmy");
        c1.addStudent(sss);
        assertTrue(c1.getStudents().contains(sss));

    }

    @Test
    public void testGetStudent(){
        Cohort c1 = new Cohort();
        Student sss = new Student(5,"Jimmy");
        Student sks = new Student(6,"Aaron");
        Student sts = new Student(7,"William");
        c1.addStudent(sss);
        c1.addStudent(sks);
        c1.addStudent(sts);
       assertEquals("Jimmy", c1.getStudents().get(0).getName());


    }



}
