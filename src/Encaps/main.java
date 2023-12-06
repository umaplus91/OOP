package Encaps;

public class main {

	public static void main(String[] args) {
		
		
		
		Car car = new Car(null, null, 0);
		
		car.setModel("Model Y");
		car.setMake("Tesla");
		car.setYear(2020);
		
		car.getMake();
		car.getModel();
		
		System.out.println(car.getModel());
		System.out.println(car.getMake());
		System.out.println(car.getYear());
		
		

	}

}
