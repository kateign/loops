package source1;

public class AddOnePos {

	public static void main(String[] args) {

		int [] myArray = new int [] {1,2,3,4,5,6,7,8};
		int actual = 8; 
		int pos = 6;
		int value = 9;

		actual = addOnePos ( myArray, actual, pos, value);
		for (int i = 0; i<= (myArray.length - 1); i++) {
			System.out.print(myArray[i] + ", ");
		}
		System.out.println("position: " + pos + "; actual: " + actual);
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
