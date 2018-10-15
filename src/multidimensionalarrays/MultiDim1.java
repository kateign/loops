package multidimensionalarrays;

public class MultiDim1 {

	public static void main(String[] args) {
		//		int [][] matrix = new int [][] {{1,2,3,4,5}, {4,5,6}};
		//
		//		printMatrix(matrix);


		//		String [][] matrix = createStrangeMatrix (0);
		//		printMatrix(matrix);

		int matrix [][] = createMatrixNumbersClever (5);
		printMatrixInt(matrix);;


	}

	public static void printMatrixInt (int matrix[][]){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}


	public static String [][] createStrangeMatrix (int size) {
		String [][] matrix;
		matrix = new String [size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i==0 || i==(matrix.length-1) || j==0 || j == (matrix[i].length - 1)){
					matrix[i][j] = "#";
				} else {
					matrix[i][j] = " ";
				}
			}
		}
		return matrix;
	}

	public static int [][] createMatrixNumbers (int size) {
		int [][] matrix;
		matrix = new int [size][size];
		int start = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<matrix[i].length; j++) {
				start++;
				matrix[i][j] = start;}
		}

		return matrix;
	}

	public static int [][] createMatrixNumbersClever (int size) {
		int [][] matrix;
		matrix = new int [size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<matrix[i].length; j++) {
				int what = i*matrix[i].length+j+1;
				matrix[i][j] = what;}
		}

		return matrix;
	}


	public static void printMatrix(int [][] mymatrix) {
		for (int i = 0; i < mymatrix.length; i++) {
			for (int j = 0; j < mymatrix[i].length; j++) {
				System.out.print(mymatrix[i][j] + ((j ==mymatrix[i].length - 1) ? "" : ","));
			}
			System.out.println();
		}
	}

	public static void printMatrix(String [][] mymatrix) {
		for (int i = 0; i < mymatrix.length; i++) {
			for (int j = 0; j < mymatrix[i].length; j++) {
				System.out.print(mymatrix[i][j] + ((j ==mymatrix[i].length - 1) ? "" : " "));
			}
			System.out.println();
		}
	}


	private static void test1() {
		// Declaration
		int[][] matrix;
		// Init
		// Classical - init with 0;
		matrix = new int[2][3];

		//	Init with values
		matrix = new int[][] {{5, 2}, {7, 2, 6}};

		// Init only the outer array
		matrix = new int[2][];
		// Init the inner arrays
		matrix[0] = new int[2];
		matrix[1] = new int[3];
		matrix [0][0] = 5;
		matrix[0][1] = 2;
		matrix[1][0] = 7;
		matrix[1][1] = 2;
		matrix[1][2] = 5;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}


}
