package functions2;

public class Calculator {

	public static void main(String[] args) {
		AdditionExe add = new AdditionExe();
		SubtractionExe sub = new SubtractionExe();
		MultiplicationExe mult = new MultiplicationExe();
		DivisionExe div = new DivisionExe();
		Factorial fact = new Factorial();
		PrintNumbers prnt = new PrintNumbers();
		VoterEligibility ve = new VoterEligibility();
		PrimeNumber pn = new PrimeNumber();
		SquareNumber sn = new SquareNumber();
		
		
		
		fact.factorial(5);
		prnt.printnumber(10);
		ve.checkVoter(19);
		pn.checkPrime(7);
		sn.checkSquare(25);
		
		System.out.println(add.add());
		System.out.println(add.add1(10, 20));
		add.add2(10,11);
		add.add3();
		
		System.out.println(sub.sub());
		System.out.println(sub.sub1(10, 200));
		sub.sub2(112,22);
		sub.sub3();
		
		System.out.println(mult.mult());
		System.out.println(mult.mult1(11, 120));
		mult.mult2(22,55);
		mult.mult3();
		
		System.out.println(div.div());
		System.out.println(div.div1(120, 20));
		div.div2();
		div.div3(55,5);
		
		
	}

}
