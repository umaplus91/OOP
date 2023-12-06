package Interface;

public class Water implements Salty,Fresh,Blue {

	@Override
	public void boating() {
		System.out.println("You can drink the fresh water");
		
	}

	@Override
	public void Surfing() {
		System.out.println("You can not drink the salty water");
		
	}
	
	public void Blurring() {
		System.out.println("You can  drink ");
	
}
}

