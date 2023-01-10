package functions2;

public class Factorial {

	public void factorial(int num1) {
		int total = 1;
		for(int i =1; i<=num1; i++) {
			total *= i;
		}
		System.out.println(total);
	}
}
