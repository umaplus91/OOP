package AbstractSubclass;

public class LazyPerson extends Person{

	@Override
	public void eat() {
		System.out.println("Lazy one : eating fastfood, unhealthy food, lots of sugar and gmo");
		
	}

	@Override
	public void exercise() {
		
		System.out.println("Lazy one : lack of movement, sleep a lot, sedentary lifestyle");
	}

}
