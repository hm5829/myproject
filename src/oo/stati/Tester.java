package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		Student stu3 = new Student(37, 59, 87);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu1 = new GraduateStudent(55, 60, 70);
		GraduateStudent gstu2 = new GraduateStudent(56, 67, 87);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(67, 56, 77));
		list.add(new Student(37, 59, 87));
		list.add(new GraduateStudent(55, 60, 70));
		list.add(new GraduateStudent(56, 67, 87));
	}
}