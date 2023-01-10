package functions2;

public class PrimeNumber {

	public void checkPrime(int num) {
		int flag = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag++;
			}else {
				continue;
			}
		}
		if(flag>0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}

}
