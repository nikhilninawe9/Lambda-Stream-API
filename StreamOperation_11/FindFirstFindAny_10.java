package StreamOperation_11;

import java.util.Optional;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

/*This will return optional object always*/
public class FindFirstFindAny_10 {

	public static Optional<Student> findFirstStudents() {
		Optional<Student> st = StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).findFirst();
		return st;
	}

	public static Optional<Student> findAnyStudents() {
		Optional<Student> st = StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() > 3).findAny();
		return st;
	}

	public static void main(String[] args) {
		Optional<Student> st = findFirstStudents();
		if (st.isPresent()) {
			System.out.println(findFirstStudents().get());
		} else {
			System.out.println("No student found");
		}

		Optional<Student> st1 = findAnyStudents();
		if (st1.isPresent()) {
			System.out.println(findAnyStudents().get());
		} else {
			System.out.println("No student found");
		}
	}
}
