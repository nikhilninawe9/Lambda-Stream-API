package Lambdas_8_MethodReference;

import java.util.function.Consumer;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class ConsumerMethodReference2 {

	/* syntax: ClassName::methodName */
	static Consumer<Student> studentConsumer1 = (s) -> System.out.println(s);
	static Consumer<Student> studentConsumer2 = System.out::println;
	static Consumer<Student> studentConsumer3 = Student::printListOfActivities;

	public static void main(String[] args) {
//		StudentDataBase.getAllStudents().forEach(studentConsumer1);
//		StudentDataBase.getAllStudents().forEach(studentConsumer2);
		StudentDataBase.getAllStudents().forEach(studentConsumer3);
	}
}
