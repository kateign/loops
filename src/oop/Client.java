package oop;

public class Client {

	public static void main(String[] args) {
		
		DynamicArray myFirstObject = new DynamicArray(100);
		
//		System.out.println(myFirstObject.size());
		myFirstObject.add(5);
//		System.out.println(myFirstObject.size());
//		myFirstObject.insert(3, 0);
//		System.out.println(myFirstObject.size());
////		DynamicArray.get(1);
		
		DynamicArray mySecondObject = new DynamicArray(50);
		
//		whichIsLarger(myFirstObject, mySecondObject);
		
		int i = 2;
		
		System.out.println("Primitive before:" + i);
		System.out.println("List size before:" + mySecondObject.size());
		
		mySecondObject = paramTester(i, mySecondObject);
		
		System.out.println("Primitive after:" + i);
		System.out.println("List size after:" + mySecondObject.size());
	}
	
	
	private static void whichIsLarger(DynamicArray list1, DynamicArray list2) {
		if (list1.size() > list2.size())
			System.out.println("List1 is larger");
		else if (list2.size() > list1.size())
			System.out.println("List2 is larger");
		else
			System.out.println("The two lists are of equal size");
	}
	
	private static DynamicArray paramTester(int j, DynamicArray bjhv) {
		
		j++;
		bjhv.add(6);
		bjhv = new DynamicArray(15);
		bjhv.add(1);
		bjhv.add(3);
		bjhv.add(2);
		bjhv.add(500);
		return bjhv;
	}
}
