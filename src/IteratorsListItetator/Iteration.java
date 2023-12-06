package IteratorsListItetator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {

	public static void main (String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Meks" );
		al.add("Reks");
		al.add("Keks");
		
		System.out.println(al.get(0));
		
		Iterator<String> iterator = al.iterator();
		
		while (iterator.hasNext()) {
			
			String tmp = iterator.next();
			System.out.println(tmp);
			}
		
		ListIterator<String> listIterator = al.listIterator();
		
		while (listIterator.hasNext()) { 
			String bpm = listIterator.next();
			System.out.println(bpm);
		}
		
		
	}
}
