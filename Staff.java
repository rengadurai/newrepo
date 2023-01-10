package functions2;

public class Staff {
	int id;
	String name;
	int age;
	String gender;
	int salary;
	int tax;
	int netSalary;
	
	public int findNetSalary() {
		return salary - (salary * tax/100);
	}
	
	public void print() {
		System.out.println(id+ "\n" + name + "\n" + age + "\n"  + gender + "\n" + salary + "\n" + tax + "\n" + netSalary + "\n" + "*********************");
	}
		
	public String getCostlyStaffName(Staff o1,Staff o2) {
			if(o1.netSalary > o2.netSalary) {
				return o1.name;
			}else {
				return o2.name;
			}
	}
	 public Staff getCostlyStaff(Staff o1, Staff o2) {
		 if(o1.netSalary > o2.netSalary) {
			 return o1;
		 }else {
			 return o2;
		 }
	 }
	 
	 public static String getLowestStaffName1(Staff o1, Staff o2, Staff o3) {
		 if(o1.netSalary<o2.netSalary && o1.netSalary<o3.netSalary) {
			 return o1.name;
		 }else if(o2.netSalary<o1.netSalary && o2.netSalary<o3.netSalary) {
			 return o2.name;
		 }else {
			 return o3.name;
		 }
	 }
	 
	 public static Staff getLowestStaff1(Staff o1, Staff o2, Staff o3) {
		 if(o1.netSalary<o2.netSalary && o1.netSalary<o3.netSalary) {
			 return o1;
		 }else if(o2.netSalary<o1.netSalary && o2.netSalary<o3.netSalary) {
			 return o2;
		 }else {
			 return o3;
		 }
	 }
	 
	 
		public static Staff getHighStaff(Staff[] arr) {
			int flag = arr[0].age;
			Staff Obj = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(arr[i].age>flag) {
					Obj = arr[i];
				}
			}
			return Obj;
		}
		

	}


