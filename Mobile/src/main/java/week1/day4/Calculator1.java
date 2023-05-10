package week1.day4;

public class Calculator1 {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subractionTwoNumbers(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multipleTwoNumbers(double a,double b) {
		double c=a*b;
		System.out.println(c);
	}
	public void divideTwoNumbers(float a,float b) {
		float c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator1 calci=new Calculator1();
		calci.additionTwoNumbers(18,100);
		calci.subractionTwoNumbers(16,80);
		calci.multipleTwoNumbers(45,87);
		calci.divideTwoNumbers(76.9F,15.7F);
	}
}
