package _99_extra;

public class ReturnTypesPractice {
	public static void main(String[] args) {
		// GOAL: Figure out what each of these hidden methods returns
		// 1. Call each method
		int meth1 = method1();
		double meth2 = method2();
		String meth3 = method3();
		char meth4 = method4();
		boolean meth5 = method5();
		// 2. Save the return of each method into a variable of the correct type(ex: String,int,etc)
		
		// 3. Print out each variable
		System.out.println(meth1 + " " + meth2 + " " + meth3 + " " + meth4 + " " + meth5);
	}
	
	static int method1() {
		return HiddenTypes.unknown1;
	}
	static double method2() {
		return HiddenTypes.unknown2;
	}
	static String method3() {
		return HiddenTypes.unknown3;
	}
	static char method4() {
		return HiddenTypes.unknown4;
	}
	static boolean method5() {
		return HiddenTypes.unknown5;
	}

}
