package IteratorsListItetator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithObject {

	public static void main(String[] args) {
		ArrayList<Animal> anml = new ArrayList<>();
		
		anml.add(new Animal ("Leon", 9000, 1.2));
		anml.add(new Animal ("Cheetah", 6000, 2.1));
		
		
		Iterator<Animal> gIterator = anml.iterator();
		
		while (gIterator.hasNext()) {
			Animal tmp = gIterator.next();
			tmp.price += 500;
			tmp.age += 1.2;
		}
		System.out.println(anml.get(1));
	}

}
