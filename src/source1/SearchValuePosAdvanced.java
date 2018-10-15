package source1;

public class SearchValuePosAdvanced {
	public static int SPARCITY = 10;

	public static void main(String[] args) {
		int value = 999;
		int pos;
		int [] arraySizes = new int [] {1000, 10000,100000,1000000};

		for (int i = 0; i <=(arraySizes.length-1); i++) {

			int [] myArray = generateArray(arraySizes[i]);
			int actual = myArray.length;
			long timer;

			//			for (int z = 0; z < myArray.length; z++) {
			//				System.out.print(myArray[z] +  " ,");}
			//			System.out.println(" ");

			timer = System.nanoTime();
			System.out.println("Size of Array :" + arraySizes[i]);	
			pos = searchForValue (myArray, value, actual);
			timer = System.nanoTime() - timer;
			//			System.out.println("Dummy way Kate: The first position of the value " + value + " is number " + pos + ".");
			System.out.println("Elapsed time of Dummy way Kate: " + timer/1000000 + "ms");

			timer = System.nanoTime();
			pos = binarySearch (myArray, value, actual);
			timer = System.nanoTime() - timer;
			//			System.out.println("Iterative Kate: The first position of the value " + value + " is number " + pos + ".");
			System.out.println("Elapsed time of Iterative Kate: " + timer/1000000 + "ms");

			timer = System.nanoTime();
			pos = recursiveBinarySearch(myArray, value, 0, actual -1);
			timer = System.nanoTime() - timer;
			//			System.out.println("Recursive Niki: The first position of the value " + value + " is number " + pos + ".");
			System.out.println("Elapsed time of Recursive Niki: " + timer/1000000 + "ms");


		}

	}

	public static int[] generateArray(int size) {
		int[] yourArray = new int[size];
		int value = (int) (Math.random()*SPARCITY);

		for (int i = 0; i < yourArray.length; i++) {
			yourArray[i] = value;
			value += (int) (Math.random()*SPARCITY);
		}
		return yourArray;
	}
	public static int searchForValue(int yourArray[], int value, int actual) {
		int iteractions = 0;

		for (int i=0; i <= (yourArray.length-1); i++) {
			iteractions ++;
			if (yourArray[i] == value) {
				System.out.println("Number of iteractions for Dummy Kate: " + iteractions + ";");
				return i;
			}
		}
		System.out.println("Number of iteractions for Dummy Kate: " + iteractions + ";");
		return -1;

	}

	public static int binarySearch(int yourArray[], int value, int actual) {
		int start = 0, end = actual - 1;
		int middle;
		int iterations = 0;

		while (start <= end) {
			iterations ++;
			middle = (end - start + 1) / 2 + start;
			if ( yourArray[middle] < value ) {
				start = middle + 1;
			} else if ( value < yourArray[middle] ) {
				end = middle - 1;
			} else {
				System.out.println("Number of iteractions for Iterative Kate: " + iterations + ";");
				return middle;
			}
		}
		System.out.println("Number of iteractions for Iterative Kate: " + iterations + ";" );
		return -1;
	}

	public static int recursiveBinarySearch(int yourArray[], int value, int start, int end) {

		if (start > end) {
//			System.out.println("Number of iterations for Recursive Niki: " + iterations + ";");
			return -1;
		}

		int middle = (end - start + 1) / 2 + start;
		int iteractions = 1;

		if ( value > yourArray[middle] ) {
			return recursiveBinarySearch(yourArray, value, middle + 1, end);
		} else if ( value < yourArray[middle] ) {
			return recursiveBinarySearch(yourArray, value, start, middle - 1);
		} else {
			System.out.println("Number of iterations for Recursive Niki: 1" + iteractions + ";");
			return middle;
		}
	}

}





