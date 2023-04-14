import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
public class CohortTest {
    Cohort empty;
    Cohort onlyOne;
    Cohort multi;
    @Before
    public void setup(){
        empty = new Cohort();
        onlyOne = new Cohort();
        multi = new Cohort();
        Student fleeb = new Student("Fleeb Man",1);
        fleeb.addGrade(90);
        fleeb.addGrade(80);
        fleeb.addGrade(70);
        Student flern = new Student("Flern McBurn",2);
        flern.addGrade(100);
        flern.addGrade(95);
        flern.addGrade(90);
        onlyOne.addStudent(fleeb);
        multi.addStudent(fleeb);
        multi.addStudent(flern);
    }
    @Test
    public void testAdd(){
        multi.addStudent(new Student("Sam",3));
        assertEquals("Sam",multi.getStudents().get(2).getName());
        multi.addStudent(new Student("Lelouch Lamperouge", 17));
        assertEquals(4,multi.getStudents().size());

    }
    @Test
    public void testGetCohortStudentRoster(){
        assertEquals(0,empty.getStudents().size());
        assertEquals(1, onlyOne.getStudents().size());
        assertEquals(2, multi.getStudents().size());
    }
    @Test
    public void testGetCohortAverage(){
        assertEquals(Double.NaN, empty.getCohortAverage(),0);
        assertEquals(80,onlyOne.getCohortAverage(),0);
        assertEquals(87.5,multi.getCohortAverage(),0);
    }
}
