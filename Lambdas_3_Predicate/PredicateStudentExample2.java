package Lambdas_3_Predicate;

import java.util.List;
import java.util.function.Predicate;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class PredicateStudentExample2 {

	public static Predicate<Student> checkStudentGradeLevel = (student) -> student.getGradeLevel() > 3;
	public static Predicate<Student> checkGpa = (studnet) -> studnet.getGpa() >= 3.9;

	public static void divider() {
		System.out.println("---------------------------------------------------------------");
	}

	public static void filterStudentByGrade() {
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(student -> {
			if (checkStudentGradeLevel.test(student)) {
				System.out.println(student.getName() + " " + student.getGradeLevel());
			}
		});
	}

	public static void filterStudentbyGpa() {
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(student -> {
			if (checkStudentGradeLevel.and(checkGpa).test(student)) {
				System.out.println(student.getName());
			}
		});
	}

	public static void filterStudents() {
		List<Student> listStudent = StudentDataBase.getAllStudents();
		listStudent.forEach(student -> {
			if (checkStudentGradeLevel.and(checkGpa).test(student)) {
				System.out.println(student.getName() + " " + student.getActivities());
			}
		});

	}

	public static void main(String[] args) {
		filterStudentByGrade();
		divider();
		filterStudentbyGpa();
		divider();
		filterStudents();
	}
}
