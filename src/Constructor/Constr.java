package Constructor;

public class Constr {
	String studentName;
	int studentAge;
	
	
	public Constr(String name) {
		studentName = name;
		
	}
	public Constr(int age) {
		studentAge = age;
	}
	public Constr(String name , int age) {
		studentName = name;
		studentAge = age;
		        
	}
	public static void main(String[] args) {
		//Constructor is sequence of class , method same as class name , java will execute constructor first
		//Constructor cannot be static or override nor void or return type
		//Default Constructor : Add different signature
		Constr obj = new Constr("Upskill");
		System.out.println(obj.studentName);
		
		Constr obj2 = new Constr(22);
		System.out.println(obj2.studentAge);
		
		Constr obj3 = new Constr("Rubio" , 33);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAge);
		
	}

}
