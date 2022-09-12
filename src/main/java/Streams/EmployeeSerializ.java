package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializ {

	public static void main(String[] args) throws IOException , ClassNotFoundException {
		
		Employ obj = new Employ(123,"nit","Btm");
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		Employ ob = null;
		
		try {
			fos = new FileOutputStream("D:\\Employ.ser");
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		}
		finally {
			oos.close();
			fos.close();
		
	}
		System.out.println("Serialization done!");
		
		FileInputStream fis  = new FileInputStream("D:\\Employ.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
		ob = (Employ)ois.readObject();
		ois.close();
		fis.close();
		
		}catch(ClassNotFoundException s) { System.out.println(s);}
		System.out.println("Employee ID is" + ob.getEmpId());
		System.out.println("Employee ID is" + ob.getEmpAdd());

	
	}
}

