package Day02Example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Impl.EmpImpl;
import com.sonata.Main.EmpExecute;
import com.sonata.Model.Employee;

public class CalTest {
	
	@Test
	public void addtest1() {
		EmpImpl e1 = new EmpImpl();
		Employee e2=new Employee();
		e2.setEmpSal(100);
		Assertions.assertEquals(1200,e1.yearlysal(e2));
	}
	@Test
	public void addtest2() {
		EmpImpl e1 = new EmpImpl();
		Employee e2=new Employee();
		e2.setEmpSal(12);
		Assertions.assertEquals(1200,e1.yearlysal(e2));
	}
		
	
	
	

}
