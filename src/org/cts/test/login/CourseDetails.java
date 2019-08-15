package org.cts.test.login;

public class CourseDetails {
public void javaCourse() {
	// this s my method
System.out.println("Welcome to java");
}
public void oracleCourse() {
	// this s my method 2
System.out.println("welcome to Oracle");
}
public static void main(String[] args) {
	//ClassName object name=new ClassName();
	CourseDetails ds = new CourseDetails ();
	ds.oracleCourse();
	ds.javaCourse();
}
}
