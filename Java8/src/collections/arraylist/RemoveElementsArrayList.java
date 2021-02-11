package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Program to Removing elements from an ArrayList
 * https://www.javaguides.net/2019/08/java-arraylist-tutorial-with-examples.html
 * @author RAMESH
 *
 */
public class RemoveElementsArrayList {
	public static void main(String[] args) {
		// Creating an ArrayList of String using
		List<String> fruits = new ArrayList<>();
		// Adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");

		System.out.println(fruits);

		// Remove the element at index `5`
		fruits.remove(5);
		System.out.println("After remove(5): " + fruits);

		// Remove the first occurrence of the given element from the ArrayList
		// (The remove() method returns false if the element does not exist in the
		// ArrayList)
		boolean isRemoved = fruits.remove("Mango");
		System.out.println("After remove(\"Mango\"): " + fruits);

		// Remove all the elements that exist in a given collection
		List<String> subfruitsList = new ArrayList<>();
		subfruitsList.add("Apple");
		subfruitsList.add("Banana");

		fruits.removeAll(subfruitsList);
		System.out.println("After removeAll(subfruitsList): " + fruits);

		// Remove all elements from the ArrayList
		fruits.clear();
		System.out.println("After clear(): " + fruits);
	}
}