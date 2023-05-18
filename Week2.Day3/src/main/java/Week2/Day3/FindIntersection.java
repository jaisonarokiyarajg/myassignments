package Week2.Day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {3,2,11,9,4,5};
		int arr2[]= {1,2,8,6,7,5};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
				  System.out.println(arr1[i]);
				
					
				}
				
			}
			
		}
	
	}

}
