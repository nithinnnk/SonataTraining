package Day02Example;

public class Student {
	int stdID;
	String stdName;
	String stdClass;
	
	Student(int i , String n ,String c){
		this.stdID = i;
		this.stdName = n;
		this.stdClass = c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(01,"Anish","12A");
		Student s2 = new Student(02,"Ashish","12B");
		System.out.println(s1.stdID +" " + s1.stdClass +" " +s1.stdName);
		System.out.println(s2.stdID +" " + s2.stdClass +" " +s2.stdName);

	}

}
