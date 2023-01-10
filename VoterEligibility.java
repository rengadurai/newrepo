package functions2;

public class VoterEligibility {
	public void checkVoter(int num) {
		if(num>18) {
			System.out.println("Eligible to Vote");
		}else {
			System.out.println("Not Eligible to Vote");
		}
	}
}
