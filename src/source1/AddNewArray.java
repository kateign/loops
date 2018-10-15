package source1;

public class AddNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = new int [] {1,2,3,4,5,6,7,8,9};
		int [] myNewArray = new int [] {9,9,9,9};
		int pos = 0;
		int actual = 9;

		actual = addNewArray (myArray, myNewArray, actual, pos);

		for (int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + ", ");

		}
		System.out.println("actual: " + actual);
	}


	public static int addNewArray (int yourArray [], int yourNewArray [], int actual, int pos) {

		if (pos + yourNewArray.length+1 > yourArray.length) {
			System.out.print("Error!");
			return actual;
		}else{

			for (int i = 0; i < yourNewArray.length; i++) {
				yourArray[pos+i]= yourNewArray[i];
			}
			return actual;
		}

	}
}