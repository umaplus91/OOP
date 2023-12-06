package Constructor;

public class Encapsulation {
	//Encapsulation used to hide the sensitive data, using setter and getter method
	private String name;
	private int ssn;
	private String username;
	
	//Setter works only with void method 
	//Getter works only with return method 
	
	//Setter method - name     //set the data , write
	public void setName(String name) {  
		this.name = name;
	}
	//Getter method - name    // get the data , read
	public String getName() {
		return name;
	}
	
	public void setUsername ( String username) {
		this.username = username;       //Getter for username
	}
	public String getUsername () {
		return username;
	}
	//Setter for SSN
	public void setSsn (int ssn) {
		this.ssn = ssn;
	}
	public int getSsn () {
		return ssn;
	}
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Umar");
		obj.setSsn(3333333);
		obj.setUsername("dsdsdsd");
		System.out.println(obj.getName());
		System.out.println(obj.getUsername());
		System.out.println(obj.ssn);
		
		
		
		//System.out.println(obj.);
		// TODO Auto-generated method stub

	}

}
