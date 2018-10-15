package source1;

public class GenerateRandomArray {

	public static void main(String[] args) {

		int [] myArray = generateArray(10);

		for (int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + ", ");
	}

	public static int[] generateArray (int size){
		int [] myArray = new int [size];
		int value = (int) (Math.random()*10);

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = value;
			value += (int) (Math.random()*10); 
		}
		return myArray;
	}

}
