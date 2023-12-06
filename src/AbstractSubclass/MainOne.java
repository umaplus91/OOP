package AbstractSubclass;

public class MainOne {

	public static void main(String[] args) {
		
		Person laz = new LazyPerson();
		Person atl = new Athlete();
		
		laz.exercise();
		atl.exercise();
		laz.eat();

	}

}
