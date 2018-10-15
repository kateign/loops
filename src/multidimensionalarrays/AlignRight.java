package multidimensionalarrays;

import java.util.Scanner;

public class AlignRight {
	private static String PAD_SYMBOL = "+"; 


	public static void main(String[] args) {
		//		System.out.println("Please add a number:");
		//		Scanner scan = new Scanner(System.in);
		//		int input = scan.nextInt();
		//		int positions = howManyPositions(input);
		//		System.out.println("The number of positions is " + positions);
		//		String newNumber = padNumber (input, 5);
		//		System.out.println("The new String is: " + newNumber);

		//		System.out.println("Please add size of the matrix:");
		//		Scanner scan = new Scanner(System.in);
		//		int size = scan.nextInt();
		int size = 3;
		int [][] mymatrix = randomArray(size);
		System.out.println("Random Array:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(mymatrix[i][j] + ((j ==mymatrix[i].length - 1) ? "" : ","));
			}
			System.out.println("");
		}


		System.out.println("");
		System.out.println("ArrayMaxValueColumn:");
		int [] arrayMaxValue = arrayMaxValueColumn (mymatrix, size);
		for (int i = 0; i < size; i++) {
			System.out.print(arrayMaxValue[i] + ((i ==(arrayMaxValue.length - 1)? "" : ",")));}


		System.out.println("");
		System.out.println("");
		System.out.println("ArrayMaxPositionColumn:");
		int [] arrayMaxPositionColumn = arrayMaxPositionColumn (arrayMaxValue);
		for (int i = 0; i < size; i++) {
			System.out.print(arrayMaxPositionColumn[i] + ((i ==(arrayMaxPositionColumn.length - 1)? "" : ",")));}

		System.out.println("\n");
		newAlignedMatrix(mymatrix, arrayMaxPositionColumn);
		System.out.println("Bye!");

	}


	private static int [][] randomArray (int size){
		int [][] yourmatrix = new int [size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int value = (int) (Math.random()*Math.pow(10, (Math.random()*9)));
				yourmatrix[i][j] = value;
			}
		}
		return yourmatrix;
	}

	private static int [] arrayMaxValueColumn (int [][] inmatrix, int size) {

		int [] arrayMaxValue = new int [size];
		for (int j = 0; j< size; j++) {
			int MAX  = Integer.MIN_VALUE;
			for (int i = 0; i < size; i++){

				if (inmatrix[i][j]>MAX) {
					MAX = inmatrix[i][j];
				}
			}
			arrayMaxValue[j] = MAX;
		}
		return arrayMaxValue;
	}

	private static int [] arrayMaxPositionColumn (int [] arrayMaxValueColumn) {
		int [] arrayMaxPositionColumn = new int [arrayMaxValueColumn.length];
		for (int i=0; i<arrayMaxPositionColumn.length; i++) {
			arrayMaxPositionColumn[i] = howManyPositions (arrayMaxValueColumn[i]);
		} 
		return arrayMaxPositionColumn;
	}

	private static int howManyPositions (int leftover) {
		int totalSize = 0;
		do {
			leftover = leftover/10;
			totalSize++;
		} while (leftover>0);
		return totalSize;
	}

	private static void newAlignedMatrix (int [][]mymatrix, int [] arrayMaxPositionColumn) {

		System.out.println("newAlignedMatrix:");
		for (int i=0; i < mymatrix.length; i++) {
			for (int j = 0; j < mymatrix[i].length; j++) {
				String full = padNumber(mymatrix[i][j], arrayMaxPositionColumn[i]);
				System.out.print(full + ((j ==mymatrix[i].length - 1) ? "" : ","));
				
			}
			System.out.println();
		}
		
	}

	private static String padNumber (int number, int totalSize) {
		String full = String.valueOf(number);
		for (int i = 0; i < totalSize - howManyPositions(number); i++) {
			full = PAD_SYMBOL + full;
		}
		return full;
	}


	//	private static int cntDigits(int number) {
	//		return String.valueOf(number).length();
	//	}

	//
	//	// 1. Method padNumber - adds spaces in front of a number, up to total size. REturns ready to print string.
	//	// 2. Review the algorithm for finding largest number in array
	//	// 3. Find the number of digits in the largest number of each column. Store these findings in a new single-dim array
	//	// 4. Use padNumber in conjunction with the single-dim array from point 3, to print right-aligned matrix in the console. 
}

