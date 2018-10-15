package source1;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		int opita;
		int entry; 
		int counter = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("How many values will you enter? ");
		opita = sc.nextInt();

		int[] myArray = new int[opita];
		boolean flag;

		do {

			if (opita > counter)
				System.out.println("Please write a value N" + (counter+1) + ":");
			entry = sc.nextInt();
			myArray[counter++]=entry;

			flag = entry == 4;
			
			entry = entry > 10 ? 10 : entry;
			
//			((entry>10)? entry=10 : entry=entry;) 
			System.out.println("Flagyt" + (flag ? "" : " ne") + " e vdignat");
			if (flag)
				System.out.println("Flagyt e vdignat");
			if (!flag)
				System.out.println("Flagyt ne e vdignat");
		} while (opita > counter);

		arrayStats(myArray);

		int[] myArray2 = new int[] {5, 7, 3, 56, 8};
		arrayStats(myArray2);



		//		//Algoritym za sumirane na elementi v masiv
		//		
		//		int sum = 0;
		//		int max = Integer.MIN_VALUE;
		//		int min = Integer.MAX_VALUE;
		//		
		//		for (int i = opita-1; i >= 0; i--) {
		//
		//			sum = sum + myArray[i];
		//			
		//			if (max < myArray [i]) {
		//				max = myArray[i];
		//			}
		//			
		//			if (min > myArray [i]) {
		//				min = myArray[i];
		//			}
		//			
		//		}
		//		System.out.println(sum);
		//		System.out.println(max);
		//		System.out.println(min);


		//do { if 
		//sum = myArray[e]

		//}
		System.out.println("Bye!");
		//		int entry;
		//		int counter = 0;
		//		int opita;
		//		double fff = 10/4;
		//		Scanner sc = new Scanner(System.in);
		//		//The user sees a message
		//		System.out.print("Vyvedete kolko opita iskate: ");
		//		do {
		//			opita = sc.nextInt();
		//
		//			if ((opita >10) || (opita < 1))
		//				System.out.println("Please write a number between 1 and 10: ");
		//		} while (opita >10 || opita < 1); 
		//
		//		do {
		//			//Declaring a new var sc and telling it it will scan the console
		//			System.out.print("Opit N " + ++counter + ": Vyvedete edno 4islo: ");
		//			//Waiting for input in console; nextInt stops the execution and waits for user input
		//			entry = sc.nextInt();

		//			int kateto = entry * 5;
		//			
		//			System.out.println("VAsheto 4islo*5 e: " + kateto);
		//			if (kateto >= 200) {
		//				System.out.println("Eeee, много");
		//	 			kateto = 199;
		//			}
		//			else System.out.println("Eeee, mnogo malko be");
		//			System.out.println("Nai-mnogo e tolko " + kateto);
		//			
		//			if (   ((kateto >= 50) && (kateto <= 100)) || ((kateto >=200) && (kateto <= 250))   )
		//				System.out.println("Bash tamyn");
		//		} while (entry != 0  && counter < opita);
		//		System.out.println("Bye!");
		//		System.out.println(Math.pow(2, 3));
		//		System.out.println(5^3);
		// TODO Auto-generated method stub
		//		System.out.println("qwe");
		//		double a = 10;
		//		String name = "pesho";
		//		String surname;
		//		boolean flag;
		//		double b = a + 6;
		//		
		//		flag = args[0].equals("pesho");
		//		
		//		if (flag) {
		//			System.out.println("flago e true");
		//			System.out.println("flagop o6te e true");
		//		} else {
		//			System.out.println("flago e false");
		//		}
	}

	public static void arrayStats(int[] inArray) {
		//Algoritym za sumirane na elementi v masiv

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = inArray.length - 1; i >= 0; i--) {

			sum = sum + inArray[i];

			if (max < inArray [i]) {
				max = inArray[i];
			}

			if (min > inArray [i]) {
				min = inArray[i];
			}

		}
		System.out.println(sum);		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void goshko (double[] array ){
		double z = 20; 
		int y = 4;
		System.out.println(z/y);
	}

}
