package source1;

public class Masivsvmykvane {

	public static void main(String[] args) {
		int pos = 2;
		int value = 4;
		int[] myArray = new int[] { 1, 2, 3, 4, 5, 0, 0, 0 };
		int actual = 5;
		

		actual = insert(myArray, actual, value, pos);
		// actual = insert(myArray, actual, 5,1);

		for (int i = 0; i < actual; i++) {
			System.out.print(myArray[i] + ",");
		}
	}

	public static int insert(int arrayToInsert[], int actual, int value, int pos) {

		for (int i = actual; i > pos; i--) {
			arrayToInsert[i] = arrayToInsert[i - 1];
		}

		arrayToInsert[pos] = value;

		return actual + 1;
	}

}