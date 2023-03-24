package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
			String pet = JOptionPane.showInputDialog("What pet do you want to buy (dog, fish, cat) : ");
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			while(true) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to do to make your " + pet + " happy", "Pets", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Take a walk" }, null);
			if(task == 0) {
				cuddle(pet);
			}
			if(task == 1) {
				food(pet);
			}
			if(task == 2) {
				walk(pet);
			}
			// 6. Use user input to call the appropriate method created in step 5 below.
			if(happinessLevel >= 100) {
				System.out.println("You love your " + pet);
				break;
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			}
	}
	public static void cuddle (String pet) {
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 35;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel += 20;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel -= 50;
			System.out.println("Happiness level is " + happinessLevel);
		}
	}
	
	
	
	
	public static void food (String pet) {
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 35;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel += 30;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel += 35;
			System.out.println("Happiness level is " + happinessLevel);
		}
	}
	
	
	
	public static void walk (String pet) {
		if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 35;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel += 10;
			System.out.println("Happiness level is " + happinessLevel);
		}
		else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel -= 50;
			System.out.println("Happiness level is " + happinessLevel);
		}
	}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}