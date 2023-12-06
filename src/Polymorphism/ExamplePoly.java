package Polymorphism;

public class ExamplePoly {

	public static void main(String[] args) {
		car( "BMW", "Manual" ,40000.00 );
		//method Overloading (Static binding/ Compile time ) Same method name 
}
//	public static void car() {
//		System.out.println("My car is Tesla ! ");
//	}
	public static void car (int height , String model ) {
		System.out.println("unknown " + height + model);
	}
//	public static void car (int door) {
//		System.out.println ("my car is tesla" + door);
//	}
	public static void car (double weight) { 
		System.out.println("my car weight is : " + weight);
	}
	public static void car (String model, int price) {
		System.out.println("my car model is  " + model  + price );
	}
	public static void car (String model, String trans , double price ) {
		System.out.println("my car's model:  " + model + " and my car's transmission is " + trans + " and my car's price is $" + price );
	}
}
