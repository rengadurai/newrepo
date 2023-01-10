package functions2;

public class UseStaff {

	public static void main(String[] args) {
		Staff s1 = new Staff();
		s1.id = 12;
		s1.name = "Rakesh";
		s1.age = 26;
		s1.gender = "Male";
		s1.salary = 35000;
		s1.tax = 5;
		s1.netSalary = s1.findNetSalary();
		s1.print();
		
		Staff s2 = new Staff();
		s2.id = 13;
		s2.name = "Ramesh";
		s2.age = 35;
		s2.gender = "Male";
		s2.salary = 39000;
		s2.tax = 8;
		s2.netSalary = s2.findNetSalary();
		s2.print();
		
		Staff s3 = new Staff();
		s3.id = 14;
		s3.name = "Suresh";
		s3.age = 30;
		s3.gender = "Male";
		s3.salary = 55000;
		s3.tax = 10;
		s3.netSalary = s3.findNetSalary();
		s3.print();
		
		Staff s4 = new Staff();
		s4.id = 15;
		s4.name = "John";
		s4.age = 28;
		s4.gender = "Male";
		s4.salary = 39545;
		s4.tax = 10;
		s4.netSalary = s4.findNetSalary();
		s4.print();
		
		
		Staff s5 = new Staff();
		s5.id = 16;
		s5.name = "William";
		s5.age = 32;
		s5.gender = "Male";
		s5.salary = 45000;
		s5.tax = 10;
		s5.netSalary = s5.findNetSalary();
		s5.print();
		
		System.out.println(s1.getCostlyStaffName(s1, s2));
		System.out.println(s1.getCostlyStaff(s4, s5).name);
		System.out.println(Staff.getLowestStaffName1(s3, s4, s5));
		System.out.println(Staff.getLowestStaff1(s3, s4, s5).name);
		
		Staff[] arr = {s1,s2,s3,s4,s5};
		System.out.println(Staff.getHighStaff(arr).name);
		
	}

}
