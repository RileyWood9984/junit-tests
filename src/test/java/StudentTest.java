import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testConstructor(){
        Student riley = new Student("Riley",1);
        Student wood = new Student("Wood",2);
        Student neil = null;
        assertNull(neil);
        assertNotNull(riley);
        assertNotNull(wood);
    }
    @Test
    public void testStudentContents(){
        Student riley = new Student("Riley Wood",1);
        assertEquals(1,riley.getId());
        assertSame("Riley Wood",riley.getName());
        assertSame(0,riley.getGrades().size());
    }
    @Test
    public void testAddGrades(){
        Student riley = new Student("Riley Wood",1);
        riley.addGrade(90);
        assertSame(90, riley.getGrades().get(0));
        riley.addGrade(80);
        assertSame(80, riley.getGrades().get(1));
    }
    @Test
    public void testAverage(){
        Student riley = new Student("Riley Wood",1);
        riley.addGrade(90);
        riley.addGrade(80);
        riley.addGrade(95);
        riley.addGrade(100);
        assertEquals(91.25,riley.getGradeAverage(),0);
    }
}
