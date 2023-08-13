
import com.javainuse.model.Employee;
import org.junit.Test;
import org.junit.Assert;


public class EmployeeTest {

    @Test
    public void testSetName() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        Assert.assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testSetDesignation() {
        Employee employee = new Employee();
        employee.setDesignation("Manager");
        Assert.assertEquals("Manager", employee.getDesignation());
    }

    @Test
    public void testSetEmpId() {
        Employee employee = new Employee();
        employee.setEmpId("123");
        Assert.assertEquals("123", employee.getEmpId());
    }

    @Test
    public void testSetSalary() {
        Employee employee = new Employee();
        employee.setSalary(5000);
        Assert.assertEquals(5000, ((int)employee.getSalary()));
    }

    @Test
    public void testEquals() {
        Employee emp1 = new Employee();
        emp1.setEmpId("1");
        emp1.setName("John Doe");
        emp1.setDesignation("Manager");
        emp1.setSalary(5000);

        Employee emp2 = new Employee();
        emp2.setEmpId("1");
        emp2.setName("John Doe");
        emp2.setDesignation("Manager");
        emp2.setSalary(5000);

        Assert.assertEquals(emp1, emp2);
    }

    @Test
    public void testHashCode() {
        Employee employee = new Employee();
        employee.setEmpId("1");
        employee.setName("John Doe");
        employee.setDesignation("Manager");
        employee.setSalary(5000);

        Assert.assertNotNull(employee.hashCode());
    }
}

