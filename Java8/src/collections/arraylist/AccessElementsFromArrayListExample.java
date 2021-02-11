package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

//https://www.javaguides.net/2019/08/java-arraylist-tutorial-with-examples.html
// How to check if an ArrayList is empty using the isEmpty() method.
// How to find the size of an ArrayList using the size() method.
// How to access the element at a particular index in an ArrayList using the get() method.
// How to modify the element at a particular index in an ArrayList using the set() method.

public class AccessElementsFromArrayListExample {
	public static void main(String[] args) {
		List<String> topProgrammingLanguages = new ArrayList<>();

		// Check if an ArrayList is empty
		System.out.println("Is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());

		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net");

		// Find the size of an ArrayList
		System.out
				.println("Here are the top " + topProgrammingLanguages.size() + " Programming Languages in the world");
		System.out.println(topProgrammingLanguages);

		// Retrieve the element at a given index
		String bestProgrammingLang = topProgrammingLanguages.get(1);
		String secondBestProgrammingLang = topProgrammingLanguages.get(1);
		String dotNetProgrammingLang = topProgrammingLanguages.get(topProgrammingLanguages.size() - 1);

		System.out.println("best Programming Lang: " + bestProgrammingLang);
		System.out.println("Second Best Programming Lang: " + secondBestProgrammingLang);
		System.out.println("Dot Net Programming Lang: " + dotNetProgrammingLang);

		// Modify the element at a given index
		topProgrammingLanguages.set(4, "C#");
		System.out.println("Modified top Programming Languages list: " + topProgrammingLanguages);
	}
}