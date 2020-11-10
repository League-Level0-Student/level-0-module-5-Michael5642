package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms_1 {
	public static void main(String[] args) {
		String numb = JOptionPane.showInputDialog("name a number");
		int bum = Integer.parseInt(numb);
		int mub = Integer.parseInt(numb) - 1;
		for (int i = 0; i < bum; i++) {
			mub = mub-1;
			if(mub==0) {
				JOptionPane.showMessageDialog(null, "the number is prime");
				System.exit(0);
			}
			double umb = bum % mub;
			if(umb != 0 && i==bum) {
				JOptionPane.showMessageDialog(null, "the number is prime");
				}
			
		else if(umb==0 && mub != 1) {
			JOptionPane.showMessageDialog(null, "the number is composite");
			System.exit(0);
			}
		
		}
		
		
		
		
	}

}
