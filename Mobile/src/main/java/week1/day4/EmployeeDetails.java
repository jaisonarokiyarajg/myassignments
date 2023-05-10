package week1.day4;

public class EmployeeDetails {
	public void getEmployeeName(String empName){
		System.out.println("employee name: "+empName);	
	}
	public void getEmployeeid(int empId){
		System.out.println("employee id: "+empId);	
	}
	public void getEmployeeAddress(String empAddress){
		System.out.println("employee address: "+empAddress);	
	}
	public void getEmployeeSalary(double empSalary){
		System.out.println("employee salary: "+empSalary);	
	}
	public void getEmployeeMobileNumber(long mobNum){
		System.out.println("mobile number: "+mobNum);	
	}
	public static void main(String[] args) {
		EmployeeDetails company=new EmployeeDetails();
		company.getEmployeeName("jaison");
		company.getEmployeeid(1313);
		company.getEmployeeAddress("pudukkottai");
		company.getEmployeeSalary(30000);
		company.getEmployeeMobileNumber(8524823423L);		
	}
}

