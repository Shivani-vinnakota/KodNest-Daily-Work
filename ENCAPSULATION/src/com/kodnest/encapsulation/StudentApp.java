package com.kodnest.encapsulation;

public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(1);
		st.setName("Raju");
		st.setMarks(99);
		st.setGender("Male");
		System.out.println(st.getId()+" "+" "+st.getName()+" "+st.getMarks()+" "+st.getGender());
	}

}
