package org.Student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id-"+id);
		System.out.println("name-"+name);
		
	}
	public void getStudentInfo(String email,Long phonenumber) {
		System.out.println(email);
		System.out.println(phonenumber);
		
	}

	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(13);
		stu.getStudentInfo(13, "jaison");
		stu.getStudentInfo("jaisonraj13@gmail.com", 8524823421L);
		
	}


}