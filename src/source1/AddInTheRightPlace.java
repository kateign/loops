package source1;

public class AddInTheRightPlace {

	public static void main(String[] args) {

		int value = 10; 
		int [] myArray = new int [] {1,2,3,4,5,6,7,8,0,0};
		int actual = 8;

		actual = insertOrdered(myArray, actual, value);
		toString (myArray, actual); 

	}
	
	public static void toString (int yourArray [], int actual) {
		for (int i=0; i<=yourArray.length-1; i++) {
			System.out.print(yourArray[i] + ", " );
		}
	}

	
	public static int insertOrdered(int [] yourArray, int actual, int value) {
		int pos = binarySearch(yourArray, value, actual);
		return addOnePos(yourArray, actual, pos, value);
		
	}

	public static int binarySearch(int yourArray[], int value, int actual) {
		int start = 0, end = actual - 1;
		int middle;

		while (start <= end) {
			middle = (end - start + 1) / 2 + start;
			if ( yourArray[middle] < value ) {
				if (middle == actual - 1 || yourArray[middle + 1] > value) {
					return middle + 1;
				}
				start = middle + 1;
			} else if ( value < yourArray[middle] ) {
				if (middle == 0 || yourArray[middle - 1] < value) {
					return middle;
				}
				end = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
	
	public static int addOnePos (int yourArray[], int actual, int pos, int value) {
		if (pos > (yourArray.length - 1)) {
			System.out.println("Position needs to be equal or less than " + (actual-1));
			return actual;

		} else {

			for (int i = (yourArray.length - 1); i > pos; i--) {
				yourArray[i] = yourArray[i-1];
			}
			yourArray[pos]=value;
			return actual;
		}
	}
}



