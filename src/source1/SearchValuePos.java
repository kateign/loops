package source1;

public class SearchValuePos {

	public static void main(String[] args) {
		int [] myArray = new int [] {1,2,3,4,5,6,7,8,9};
		int value = 11;
		int pos; 
		int actual = 9;

		int i = searchForValue (myArray, value, actual);
		System.out.print("The first position of the value " + value + " is number" + i + ".");

	}
	public static int searchForValue(int yourArray[], int value, int actual) {

		for (int i=0; i <= (yourArray.length-1); i++) {
			if (yourArray[i] == value) {
				System.out.print("The first position of the value " + value + "is number" + i + ".");
				return i;
			}
		}
		
		System.out.print("There is no such value!");
		return -1;

	}
}
