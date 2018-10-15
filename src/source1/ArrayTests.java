package source1;

public class ArrayTests {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 3;
		int value = 6;
		int [] myArray = new int [] {5,2,7,1,3,0,0,0};
		int actual = 5;

//		actual = insert(myArray, actual, value, pos);
//		actual = insert(myArray, actual, 9, 2);
//		actual = insert(myArray, actual, 5, 3);
//		actual = insert(myArray, actual, 4, 5);
		actual = insert(myArray, actual, 15, 6);

		for (int i=0; i < actual; i++) {
			System.out.print(myArray[i] + ",");
		}

	}


	public static int insert (int arrayToInsert[], int actual, int value, int pos) {

		if (arrayToInsert.length <= actual || pos >= actual)  {
			System.out.println("Error!");
			return -1;
		} else {
			for (int i = actual; i > pos; i--) {
				arrayToInsert[i] = arrayToInsert[i-1];
			}
			arrayToInsert[pos] = value;

			return actual + 1;
		}	
	}
}