package _01_algorithms._2_fibonacci;

public class fibonacci_ {
public static void main(String[] args) {
	int num1 = 1;
	int num2 = 1;
	for (int i = 0; i < 20; i++) {
		int sum = num1 + num2;
		System.out.println(num1+"+"+num2+"="+sum);
		num1 = num2;
		num2 = sum;
		
	}
	
	
	
	
	
	}
}
