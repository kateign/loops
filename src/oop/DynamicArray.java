package oop;

public class DynamicArray {
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static int numberOfInstances = 0;
	
	private int[] underlyingArray;
	private int actualSize;

	
	public DynamicArray() {
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	public DynamicArray(int initialCapacity) {
		underlyingArray = new int[initialCapacity];
		actualSize = 0;
		DynamicArray.numberOfInstances++;
	}
	
	
	
	/**
	 * Serches for the given value
	 * @param value The value to serch
	 * @return the index of the value, -1 if not found
	 */
	public int searchForValue(int value) {
		for (int i=0; i <= actualSize - 1; i++) {
			if (underlyingArray[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public void generateArray(int size, int sparcity) {
		underlyingArray = new int[size];
		actualSize = size;
		int value = (int) (Math.random()*sparcity);

		for (int i = 0; i < underlyingArray.length; i++) {
			underlyingArray[i] = value;
			value += (int) (Math.random()*sparcity);
		}
	}
	
	public void add (int value) {
		if (underlyingArray.length <= actualSize)  {
			System.out.println("Error!");
		} else {
			underlyingArray[actualSize] = value;
			actualSize++;
		}
	}	

	public void insert (int value, int pos) {
		if (pos > actualSize - 1) {
			System.out.println("Position needs to be equal or less than " + (actualSize - 1));
		} else {
			for (int i = actualSize - 1; i > pos; i--) {
				underlyingArray[i] = underlyingArray[i-1];
			}
			underlyingArray[pos]=value;
			actualSize++;
		}
	}
	
	public void remove(int pos) {

		if (pos > actualSize-1) {
			System.out.println("Error! Position should be a number smaller or equal to " + actualSize + ";");
		} else {
			for (int i = pos; i <= actualSize-2; i++) {
				underlyingArray[i] = underlyingArray[i+1];
			}
			underlyingArray[actualSize - 1] = 0;
			actualSize--;
		}
	}
	
	public int get(int position) {
		if (position < actualSize)
			return underlyingArray[position];
		else
			throw new ArrayIndexOutOfBoundsException(position);
	}

	public void asString () {
		for (int i=0; i < actualSize; i++) {
			System.out.print(underlyingArray[i] + ", " );
		}
	}
	
	public int size() {
		return actualSize;
	}
}
