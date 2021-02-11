package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// How to create an ArrayList using the ArrayList() constructor.
// Add new elements to an ArrayList using the add() method.
// https://www.javaguides.net/2019/08/java-arraylist-tutorial-with-examples.html

public class CreateArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList of String using
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		System.out.println(fruits);
	}
}
