package Day2;

public class day2assessment2 {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
				}

				System.out.println("The numbers are : " + arr[i] + arr[j]);
			}
		}
	}
}
