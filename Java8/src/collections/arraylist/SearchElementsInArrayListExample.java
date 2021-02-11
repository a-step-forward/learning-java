package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

//https://www.javaguides.net/2019/08/java-arraylist-tutorial-with-examples.html

// Check if an ArrayList contains a given element | contains()

// Find the index of the first occurrence of an element in an ArrayList | indexOf()

// Find the index of the last occurrence of an element in an ArrayList | lastIndexOf()

public class SearchElementsInArrayListExample {
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

		// Check if an ArrayList contains a given element
		System.out.println("Does names array contain \"mango\"? : " + fruits.contains("mango"));

		// Find the index of the first occurrence of an element in an ArrayList
		System.out.println("indexOf \"Banana\": " + fruits.indexOf("Banana"));
		System.out.println("indexOf \"Apple\": " + fruits.indexOf("Apple"));

		// Find the index of the last occurrence of an element in an ArrayList
		System.out.println("lastIndexOf \"Watermelon\" : " + fruits.lastIndexOf("Watermelon"));
		System.out.println("lastIndexOf \"Strawberry\" : " + fruits.lastIndexOf("Strawberry"));
	}
}