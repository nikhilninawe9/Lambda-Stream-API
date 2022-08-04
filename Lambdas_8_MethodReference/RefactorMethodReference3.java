package Lambdas_8_MethodReference;

import java.util.function.Predicate;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class RefactorMethodReference3 {

	static Predicate<Student> sPredicate1 = (student) -> student.getGradeLevel() >= 3;

	static Predicate<Student> sPredicate2 = RefactorMethodReference3::greaterThanGradeLevel;

	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {
		System.out.println(sPredicate2.test(StudentDataBase.studentSupplier.get()));// true
	}
}
