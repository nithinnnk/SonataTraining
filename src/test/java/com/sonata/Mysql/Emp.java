package com.sonata.Mysql;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sonata.DAO.EmployeeIntf;
import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.EModel.Employee;

class Emp {
	Employee e1 = new Employee();
    EmployeeImpl ep1 = new EmployeeImpl();
    
    @Test
    public void dbTest1() {
        e1.setEmpID(9);
        e1.setEmpName("veer");
        e1.setEmpSal(6500.00);
        assertEquals(1, ep1.save(e1));
    }
    
    @Test
    public void dbTest2() {
        e1.setEmpID(11);
        e1.setEmpName("ravi");
        e1.setEmpSal(7000.00);
        assertEquals(0, ep1.save(e1));
    }
}

	

