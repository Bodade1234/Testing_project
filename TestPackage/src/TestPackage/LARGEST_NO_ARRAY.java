package TestPackage;

public class LARGEST_NO_ARRAY {
	
	public static void main(String[] args) {

		int a[] = { 20, 60, 89, 48, 77, 333, 666,2000 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[1] < a[i]) {

				max = a[i];
			}
		}
		System.out.println("THE LARGEST ELEMENT IN ARRAYS :-" + max);
	}

}


