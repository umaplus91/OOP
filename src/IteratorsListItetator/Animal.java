package IteratorsListItetator;

public class Animal {

	String breed;
	int price;
	double age;

	Animal(String breed, int price, double age) {
		this.breed = breed;
		this.price = price;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", price= $" + price + ", age=" + age + "]";
	}
	
	
}