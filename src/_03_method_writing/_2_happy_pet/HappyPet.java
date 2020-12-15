package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String petChoice = JOptionPane.showInputDialog("what kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 10; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "Interact with your pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet it", "wash it", "play with it" }, 0);
			if (task==0) {
				petAct();
			}
			
			else if(task==1) {
				washAct();
			}
			else if(task==2) {
				playAct();
				}
			if(happinessLevel >= 50) {
				JOptionPane.showMessageDialog(null, "your pet had a great day!");
				break;
			}	
			
			
			}
			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void petAct() {
		JOptionPane.showMessageDialog(null, "Your pet is shows it's stomach");
		happinessLevel = happinessLevel + 5;
		System.out.println(happinessLevel);
	}
	static void washAct() {
		JOptionPane.showMessageDialog(null, "Your pet refuses to move");
		happinessLevel = happinessLevel - 5;
		System.out.println(happinessLevel);
	}
	static void playAct() {
		JOptionPane.showMessageDialog(null, "You and your pet are dead tired from playing too much");
		happinessLevel = happinessLevel +10;
		System.out.println(happinessLevel);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}