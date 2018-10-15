package source1;

public class RemoveOnePos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int [] myArray = new int [] {1,2,3,4,5,6,7,8};
		int [] myArray1 = new int [] {8,7,6,5,4,3,2,1};
		int [] myArray2 = new int [] {0,1,2,3,4,5,6,7};
		int actual = 8;
		int pos = 7;


		actual = remove(myArray, actual, pos);
		toString(myArray, actual, pos);
		actual = remove(myArray1, actual, pos);
		toString(myArray1, actual, pos);
		actual = remove(myArray2, actual, pos);
		toString(myArray2, actual, pos);
	}

	public static void toString (int yourArray [], int actual, int pos) {
		for (int i=0; i<=yourArray.length-1; i++) {
			System.out.print(yourArray[i] + ", " );
		}
		System.out.println("position: " + pos + "; " + "actual = " + actual);
	}





	public static int remove(int yourArray[], int actual, int pos) {

		if (pos > actual-1) {
			System.out.println("Error! Position should be a number smaller or equal to " + actual + ";");
			return actual;

		} else {

			for (int i = pos; i <= (yourArray.length-2); i++) {
				yourArray[i] = yourArray[i+1];

			}
			yourArray[(yourArray.length - 1)] = 0;
			return actual - 1;

		}

	}


}
