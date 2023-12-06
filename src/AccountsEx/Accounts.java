package AccountsEx;

public class Accounts {
   
	private String name;
	private double balance;
	private double money;
	private int id;
	
	
	public Accounts() {
		
	}
	
	public Accounts(String name , int id , double balance) {
		this.name = name ;
		this.id = id;
		this.balance = balance;
		
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
				
	}
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public double getBalance () {
		return balance;
				
	}
	public void setBalace( double balance) {
		this.balance = balance;
		
	}
	
	public double getMoney () {
		return money;
	}
	public void setMoney (double money) {
		this.money = money;
		
	}
	
	public String toString() {
		return "Account [name = " + name  + ", id=" + id + ",+ balance" + balance + "]";
		
	}
	public void balanceInquery () {
		System.out.println( name + "Cuurent Balance IS ::" + balance);
	}
	
	public String withdrawMoney () {
		return name + "Withraw Money Successfully ";
	}
}
	
	
	
	
			
			
			
		
	
	
	
	
	

