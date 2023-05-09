package week1.day2;

public class mobile {
	String mobileBrandName="Samsung";
	char mobileLogo='S';
	short noOfMobilePiece=5;
	int modelNumber=25995;
	long mobileImeiNumber=2385496L;
	float mobilePrice=185.75F;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		mobile samsung=new mobile();
		System.out.println(samsung.mobileBrandName);
		System.out.println(samsung.mobileLogo);
		System.out.println(samsung.noOfMobilePiece);
		System.out.println(samsung.modelNumber);
		System.out.println(samsung.mobileImeiNumber);
		System.out.println(samsung.mobilePrice);
		System.out.println(samsung.isDamaged);
	}
}
 