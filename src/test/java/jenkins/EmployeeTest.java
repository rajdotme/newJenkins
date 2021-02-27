package jenkins;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testEmployee() {
		Employee e = new Employee(1, "Raj");
		Assert.assertTrue(e.getName().equals("Raj"));
	}

}
