package Lambda_5_FunctionInterface;

public class FunctionExample2 {
	public static String performConcat(String str) {
		return FunctionExample1.addSomething.apply(str);
	}

	public static void main(String[] args) {
		System.out.println(performConcat("sdfsfsdffds"));
	}
}
