     package HomeWork;

import java.util.*;



public class HomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//inputting for the first set 
		System.out.println("Input the number in the first set: ");
		int num1 = scanner.nextInt();
		Set<Integer> set1 = new HashSet<>();
		System.out.println("Input the element of the first set");
		for (int i = 0; i < num1; i++ ) {
			set1.add(scanner.nextInt());
		}
		//inputting for the  second set
		System.out.println("Input the number in the second set");
		int num2 = scanner.nextInt();
		Set<Integer> set2 = new HashSet<>();
		System.out.println("Input the element of the second set");
		for (int i=0; i < num2; i++) {
			set2.add(scanner.nextInt());
		}
		//Finding the common elements
		Set<Integer> common = new HashSet<>(set1);
		common.retainAll(set2);
		
		//Displaying common elements
		System.out.println("Common elements in both sets" + common);
		scanner.close();
	}

}
