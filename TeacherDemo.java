import java.util.Scanner;
 class Teacher {
	Teacher(String name){
		System.out.println("Teacher's name is " + name);
	}
}
class Student extends Teacher{
	Student(String name){
		super("Keerthi");
		System.out.println("Student's name is " + name);
	}
}
class TeacherDemo {
public static void main(String[]args){
	Student x = new Student("Alina");
}
}
