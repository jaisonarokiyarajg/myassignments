package org.college;
	public class Department extends College {
		
		public void deptName() {
			System.out.println("Department Name = Computer Application");
		}
		
		public static void main(String[] args) {

			Department dept = new Department();
			dept.collegeCode();
			dept.collegeName();
			dept.collegeRank();
			dept.deptName();

		}
}
