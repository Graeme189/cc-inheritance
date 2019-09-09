import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;
    private final double epsilon = 0.00001;

    @Before
    public void before() {
        developer = new Developer("Ryan", "JG XX 01", 30000);
    }

    @Test
    public void testName() {
        assertEquals("Ryan", developer.getName());
    }

    @Test
    public void testNiNumber() {
        assertEquals("JG XX 01", developer.getNiNumber());
    }

    @Test
    public void testSalary() {
        assertEquals(30000, developer.getSalary(), epsilon);
    }

    @Test
    public void testRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(31000, developer.getSalary(), epsilon);
    }

    @Test
    public void testPayBonus() {
        developer.payBonus();
        assertEquals(300, developer.payBonus(), epsilon);
    }
}
