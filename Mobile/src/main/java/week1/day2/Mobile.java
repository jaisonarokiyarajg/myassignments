package week1.day2;

public class Mobile {
	String mobileBrandName="Samsung 001";
	char mobileLogo='S';
	short noOfMobilePiece=52;
	int modelNumber=33;
	long mobileImeiNumber=655517L;
	float mobilePrice=31999.99F;
	boolean isDamaged=true;
	
	public static void main(String[] args) {
		
		Mobile samsung=new Mobile();
		System.out.println(samsung.mobileBrandName);
		System.out.println(samsung.mobileLogo);
		System.out.println(samsung.noOfMobilePiece);
		System.out.println(samsung.modelNumber);
		System.out.println(samsung.mobileImeiNumber);
		System.out.println(samsung.mobilePrice);
		System.out.println(samsung.isDamaged);
		
	
	}

}
