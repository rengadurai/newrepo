package functions2;

public class SquareNumber {
	public void checkSquare(int num) {
		int flag = 0;
		for(int i =1; i<num; i++) {
			if(i*i==num) {
				flag++;
			}else {
				continue;
			}
		}
		if(flag>0) {
			System.out.println("Is a Square Number");
		}else {
			System.out.println("Not Square Number");
		}
	}

}
