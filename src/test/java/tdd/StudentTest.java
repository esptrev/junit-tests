package tdd;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void testGetId(){
        Student s1 = new Student();
        /// set id
       s1.setId(1);
        /// test that id was set

//        fail("Forced Fail");
        assertEquals(1, s1.getId());
    }


   @Test
    public void testGetName(){
        Student s1 = new Student();
        s1.setName("Korbin");

       assertEquals("Korbin", s1.getName());
   }

   @Test
    public void testAddGrade(){
        Student s1 = new Student(1,"Kristin");
        s1.addGrade(70);
        assertEquals(Arrays.asList(70), s1.getGrades());
   }

   @Test
    public void testStudentConstructor(){
        Student s2 = new Student(2,"Trevor");
        s2.addGrade(70);
        s2.addGrade(80);
        s2.addGrade(90);
       assertEquals(2, s2.getId());
       assertEquals("Trevor", s2.getName());
       assertEquals(Arrays.asList(70,80,90),s2.getGrades());

   }

   @Test
    public void testGetGradeAverage(){
       Student s4 = new Student(4,"Larry");
       s4.addGrade(70);
       s4.addGrade(75);
       s4.addGrade(80);
       s4.addGrade(85);
       s4.addGrade(90);
       s4.addGrade(95);
       assertEquals(82.5, s4.getGradeAverage(),5);
   }







}///END OF CLASS
