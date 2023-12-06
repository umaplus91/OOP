package IteratorsListItetator;

public class ForEach {

	public static void main(String[] args) {
		
		Animal cat = new Animal("Sphynx", 2000 , 1.2);
		Animal dog = new Animal( "Bulldog", 4000 , 2);
		Animal bird = new Animal("Sparrow",  1000, 0.7);
		Animal wildcat = new Animal("Jaguar", 7000, 0);
		
		Animal[] sell = {cat , dog , bird , wildcat};
		
		//for each
		for (Animal any : sell) {
			any.price = any.price + 400;
		}
		for (Animal any : sell) {
			any.age = any.age + 1;
		}
		for (Animal any : sell) {
			System.out.println(any.breed + ", $" + any.price + ", Age = " + any.age);
		}

	}

}
