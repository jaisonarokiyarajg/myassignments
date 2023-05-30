package org.college;

	public class Student extends Department {
		
		public void studentName() {
			System.out.println("Student Name = jaison Arokiyaraj.G");
		}
		public void studentDept() {
			System.out.println("Student Department = Computer Application");
		}
		public void studentId() {
			System.out.println("Student Id = 131313");
		}

		public static void main(String[] args) {
			
			Student student = new Student();
			student.collegeCode();
			student.collegeName();
			student.collegeRank();
			student.deptName();
			student.studentName();
			student.studentDept();
			student.studentId();
			

		}

	}
