package AccountsEx;

public class AccountType {

	public static void main(String[] args) {
		
				Accounts SBI = new Accounts("Alex", 12 , 10000.00);
				Accounts SSV = new Accounts("Navi", 11, 2323232.00);
				
				//SBI
				System.out.println(SBI.toString());
				SBI.balanceInquery();
				SBI.setMoney(900);
				
				System.out.println("Alex Withdraw Money From SBI::" + SBI.getMoney());
				System.out.println("Alex Withdraw Money From SBI::" + SBI.withdrawMoney());
			
				//SSV
				System.out.println(SSV.toString());
				SSV.balanceInquery();
				SSV.setMoney(60);
				
				System.out.println("NAVI Withdraw Money From SBI::" + SSV.getMoney());
				System.out.println("NAVI Withdraw Money From SBI::" + SSV.withdrawMoney());
				
				
	}

}
