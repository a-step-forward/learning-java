package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

//https://www.javaguides.net/2019/08/java-arraylist-tutorial-with-examples.html

public class NullAndDuplicateValuesDemo {

	public static void main(String[] args) {
		nullValueDemo();
		duplicateValueDemo();
	}

	private static void nullValueDemo() {
		List<String> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		System.out.println(list.toString());
	}

	private static void duplicateValueDemo() {
		List<String> list = new ArrayList<>();
		list.add("duplicate");
		list.add("duplicate");
		System.out.println(list.toString());
	}
}