import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    private final double epsilon = 0.00001;

    @Before
    public void before() {
       manager = new Manager("Ryan", "JG XX 01", 30000, "IT");
    }

    @Test
    public void testName() {
        assertEquals("Ryan", manager.getName());
    }

    @Test
    public void testNiNumber() {
        assertEquals("JG XX 01", manager.getNiNumber());
    }

    @Test
    public void testSalary() {
        assertEquals(30000, manager.getSalary(), epsilon);
    }

    @Test
    public void testDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary(), epsilon);
    }

    @Test
    public void testPayBonus() {
        manager.payBonus();
        assertEquals(300, manager.payBonus(), epsilon);
    }
}
