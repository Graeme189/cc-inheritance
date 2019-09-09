import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;
    private final double epsilon = 0.00001;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Ryan", "JG XX 01", 30000);
    }

    @Test
    public void testName() {
        assertEquals("Ryan", dbAdmin.getName());
    }

    @Test
    public void testSetName() {
        dbAdmin.setName("Ronald");
        assertEquals("Ronald", dbAdmin.getName());
    }

    @Test
    public void testSetNameNull() {
        dbAdmin.setName(null);
        assertEquals("Ryan", dbAdmin.getName());
    }

    @Test
    public void testSetNameEmptyString() {
        dbAdmin.setName("");
        assertEquals("Ryan", dbAdmin.getName());
    }
    
    @Test
    public void testNiNumber() {
        assertEquals("JG XX 01", dbAdmin.getNiNumber());
    }

    @Test
    public void testSalary() {
        assertEquals(30000, dbAdmin.getSalary(), epsilon);
    }

    @Test
    public void testRaiseSalary() {
        dbAdmin.raiseSalary(1000);
        assertEquals(31000, dbAdmin.getSalary(), epsilon);
    }

    @Test
    public void testRaiseSalaryNoNegative() {
        dbAdmin.raiseSalary(-1000);
        assertEquals(30000, dbAdmin.getSalary(), epsilon);
    }

    @Test
    public void testPayBonus() {
        dbAdmin.payBonus();
        assertEquals(300, dbAdmin.payBonus(), epsilon);
    }
}