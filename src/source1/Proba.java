package source1;

import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		int opita, 
			entry, 
			counter = 0,
			sum = 0,
			max = Integer.MIN_VALUE,
			min = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		System.out.print("How many values will you enter? ");
		opita = sc.nextInt();

		do {

			if (opita > counter)
				System.out.println("Please write a value N" + (counter+1) + ":");
			entry = sc.nextInt();
			counter++;

			sum += entry;

			if (max < entry) {
				max = entry;
			}

			if (min > entry) {
				min = entry;
			}

		} while (opita > counter);

		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);	
		System.out.println("Bye!");
	}


}

