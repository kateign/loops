package source1;

public class ZadachaAddInMassive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int value = 7;

		int [] myArray = new int [] {1,2,3,4,5,6,0,0};
		int [] yourArray = new int [] {7,8};
		int actual = 0;

		actual = addArray (myArray, actual, 7, 8, 9);
		toString(myArray, actual);

		//		for (int i = 0; i < myArray.length; i++) {
		//
		//			actual = remove(myArray, actual, 0);
		//			toString(myArray, actual);			
		//		}
		//
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//		actual = remove(myArray, actual, 0);
		//		toString(myArray, actual);
		//
		//
	}

	public static void toString(int arrayToInsert[], int actual) {

		for (int i=0; i < arrayToInsert.length; i++){
			System.out.print(arrayToInsert[i] + ",");
		}
		System.out.println("actual: " + actual);
	}

	public static int remove (int arrayToInsert[], int actual, int pos) {
		if (actual <= pos)  {
			System.out.println("Error!");
			return actual;
		} else {

			for (int i = pos; i < actual; i++) {
				arrayToInsert[i] = arrayToInsert[i+1];
			}
			arrayToInsert[arrayToInsert.length-1] = 0;
			return actual - 1;
		}

	}



	public static int insert (int arrayToInsert[], int actual, int value, int pos) {

		if (arrayToInsert.length <= actual || pos >= actual)  {
			System.out.println("Error!");
			return actual;
		} else {
			for (int i = actual; i > pos; i--) {
				arrayToInsert[i] = arrayToInsert[i-1];
			}
			arrayToInsert[pos] = value;

			return actual + 1;
		}	
	}

	public static int add (int arrayToInsert[], int actual, int value) {
		if (arrayToInsert.length <= actual)  {
			System.out.println("Error!");
			return actual;
		} else {

			arrayToInsert[actual] = value;

			return actual + 1;
		}
	}	

	public static int insertArray (int arrayToInsert[], int arrayNewToInsert [], int actual, int pos) {

		if (((actual + arrayNewToInsert.length) > arrayToInsert.length) || (pos >=actual)) {
			System.out.println("Error!");
			return actual + arrayNewToInsert.length;

		} else {
						
			for (int i = (actual+ arrayNewToInsert.length-1); i >= pos + arrayNewToInsert.length ; i--) {
				arrayToInsert [i] = arrayToInsert[i - arrayNewToInsert.length ];
			}
			
			for (int i = 0; i <arrayNewToInsert.length; i++) {
				arrayToInsert [pos + i] = arrayNewToInsert [i];
			}
			return actual + arrayNewToInsert.length;
		}

	}
	
	public static int addArray (int arrayToInsert[], int actual, int ...arrayNewToInsert) {
		if (arrayNewToInsert.length + actual > arrayToInsert.length)  {
			System.out.println("Error!");
			return actual;
			
		} else {
			
			for (int i = 0; i <arrayNewToInsert.length; i++) {
				arrayToInsert[actual + i] = arrayNewToInsert [i];

			
		}
			
			return actual + arrayNewToInsert.length;
		}
	}	
}



