import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    private final double epsilon = 0.00001;

    @Before
    public void before() {
        director = new Director("Ryan", "JG XX 01", 30000, "IT", 10000);
    }

    @Test
    public void testName() {
        assertEquals("Ryan", director.getName());
    }

    @Test
    public void testNiNumber() {
        assertEquals("JG XX 01", director.getNiNumber());
    }

    @Test
    public void testSalary() {
        assertEquals(30000, director.getSalary(), epsilon);
    }

    @Test
    public void testDeptName() {
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void testRaiseSalary() {
        director.raiseSalary(1000);
        assertEquals(31000, director.getSalary(), epsilon);
    }

    @Test
    public void testPayBonus() {
        director.payBonus();
        assertEquals(300, director.payBonus(), epsilon);
    }

    @Test
    public void testBudget() {
        assertEquals(10000, director.getBudget(), epsilon);
    }
}