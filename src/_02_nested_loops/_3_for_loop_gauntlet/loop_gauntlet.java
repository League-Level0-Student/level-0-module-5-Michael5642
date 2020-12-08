package _02_nested_loops._3_for_loop_gauntlet;



public class loop_gauntlet {
public static void main(String[] args) {
	int counterHundred = 0;
	//loop from 100 - 0
	for (int i = 0; i < 101; i++) {
		System.out.println(100 - counterHundred);
		
		counterHundred = counterHundred + 1;
		}
	counterHundred = 0;
	//loop from 0 - 100
	for (int i = 0; i < 101; i++) {
		System.out.println(0 - counterHundred*-1);
		counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	//loop listing ONLY evens from 0 - 100
	for (int i = 0; i < 101; i++) {
		if(counterHundred%2 == 0) {
			System.out.println(counterHundred);
		}
		counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	//loop listing ONLY odds from 1-99
	for (int i = 0; i < 101; i++) {
		if (counterHundred%2 != 0) {
			System.out.println(counterHundred);
		}
		counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	//loop distinguishing odd from even 0 - 500
	for (int i = 0; i < 501; i++) {
		if (counterHundred%2 != 0) {
			System.out.println(counterHundred + " the number is odd");
		}
			if(counterHundred%2 == 0) {
				System.out.println(counterHundred + " the number is even");
			}
			counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	//loop for listing multiples of 7 from 0 - 777
	for (int i = 0; i < 778; i++) {
		if (counterHundred%7 == 0) {
			System.out.println(counterHundred);
		}
		counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	//loop for age
	for (int i = 0; i < 16; i++) {
		System.out.println("In " + (2005+counterHundred) + " I was " + counterHundred + " years old.");
		counterHundred = counterHundred + 1;
	}
	counterHundred = 0;
	int counterHundred2 = 0;
	String numList = counterHundred + " " + counterHundred2;
	//loops for nested loop excercise 1
	for (int i = 0; i < 9; i++) {
		numList = counterHundred + " " + counterHundred2;
		
			System.out.println(numList);
			counterHundred2 = counterHundred2 + 1;
			if (i == 2 || i == 5) {
				counterHundred2 = 0;
				counterHundred = counterHundred + 1;
			}
		
		
	}
	
	counterHundred = 0;
	//loop for the 1-9 3x3 grid
	for (int i = 0; i < 3; i++) {
		System.out.println((counterHundred + 1) +  " " + (counterHundred + 2) + " " + (counterHundred + 3));
		counterHundred = counterHundred + 3;
	}
	
	counterHundred = 0;
	//loop for the 1-100 10x10 grid
	for (int i = 0; i < 10; i++) {
		System.out.println((counterHundred + 1) +  " " + (counterHundred + 2) + " " + (counterHundred + 3) + " " + (counterHundred + 4) +  " " + (counterHundred + 5) + " " + (counterHundred + 6) + " " + (counterHundred + 7) +  " " + (counterHundred + 8) + " " + (counterHundred + 9) + " " + (counterHundred + 10));
		counterHundred = counterHundred + 10;
	}
	counterHundred = 0;
	String numList2 = "";
	//loop for the * grid
 	for (int i = 0; i < 7; i++) {
		System.out.println(numList2);
		numList2 = numList2 + " *";
	}
	//counting down from 100 without prior code
	for (int i = 0; i < 100; i++) {
		System.out.println(-1*(i - 100));
		}
	
	}
}
