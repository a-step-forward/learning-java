package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Java 8 forEach and lambda expression.
// iterator().
// iterator() and Java 8 forEachRemaining() method.
// listIterator().
// Simple for-each loop.
// for loop with index.

public class IterateOverArrayListExample {
	public static void main(String[] args) {
		// Creating an ArrayList of String using
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("Watermelon");
		fruits.add("Strawberry");

		System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		});

		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> fruitsIterator = fruits.iterator();
		while (fruitsIterator.hasNext()) {
			String tvShow = fruitsIterator.next();
			System.out.println(tvShow);
		}

		System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
		fruitsIterator = fruits.iterator();
		fruitsIterator.forEachRemaining(fruit -> {
			System.out.println(fruit);
		});

		System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		// Here, we start from the end of the list and traverse backwards.
		ListIterator<String> listIterator = fruits.listIterator(fruits.size());
		while (listIterator.hasPrevious()) {
			String fruit = listIterator.previous();
			System.out.println(fruit);
		}

		System.out.println("\n=== Iterate using simple for-each loop ===");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("\n=== Iterate using for loop with index ===");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
}