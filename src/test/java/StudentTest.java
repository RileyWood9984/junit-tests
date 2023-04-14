import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testConstructor(){
        Student Riley = new Student("riley",12);
        Student Wood = new Student("Wood",1);
        Student Neil = null;
        assertNull(Neil);
        assertNotNull(Riley);
        assertNotNull(Wood);
    }
}
