package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

class Student {
	 
	 private String name;
	 private String college;
	 
	 
	 public Student(String name, String college) {
	  super();
	  this.name = name;
	  this.college = college;
	 }
	 
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getCollege() {
	  return college;
	 }
	 public void setCollege(String college) {
	  this.college = college;
	 }
	}

public class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "ABC"));
        students.add(new Student("Prakash", "ABC"));
        students.add(new Student("Tony", "ABC"));

        students.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", College : " + user.getCollege());
        });
    }
}