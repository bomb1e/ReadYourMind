import java.util.*;

public class ReadYourMind{
	
	public static void main(String args[]){
		GameArrays elementArray = new GameArrays();
		Core core = new Core();
		//This is the first part. It includes the welcome address, username, choice of play and leads to the main game.
		int choice = 0;
		int sum = 0;
		String user = "";
		Scanner num = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		// Scanner input3 = new Scanner(System.in);
		System.out.println("Welcome to MindReader Game.");
		System.out.println("Do you REALLY want to play mind reader?");
		System.out.println("1. YES");
		System.out.println("2. NO");
		if (num.hasNextInt()) {
			try{
				choice = num.nextInt();
			}
			catch (NumberFormatException e){
				System.out.println("Please enter 1 or 2");
			}
			if(choice == 1){
				System.out.println("Thanks for opting to play MindReader.");
				System.out.println("Enter your username");
				if (text.hasNextLine()) {
					user = text.nextLine().toUpperCase();
				}
				// System.out.println("Choose List\n 1.EiTs");
				System.out.println("\n"+"Okay "+ user +", Here is the List. Pick a name and keep it a secret");
				System.out.println("===================================================");
				for (int i=1; i < elementArray.list.length; i++) {
					System.out.print(elementArray.list[i] + " | ");
					if(i%5==0){
						System.out.println("\n");
					}
					core.wait(0.5);
				}
				System.out.print("\n");
				System.out.println("===================================================");	
				core.pressAnyKeyToContinue();
				sum = core.coreGame(elementArray.cardArray);
				System.out.println(user + " picked " + elementArray.list[sum]);	
				core.wait(2);
				System.out.println("\n'" + core.randomElementPicker(elementArray.exitQuotes) + "'" + " - @50NerdsOfGrey");	
			}
		else if (choice==2){
			System.out.println("You have opted to exit ReadYourMind.");
			core.wait(2);
			System.out.println("\n'" + core.randomElementPicker(elementArray.noPlayQuotes) + "'" + " - gotinsults");
		}
		core.wait(2);
		System.out.println("\n==============================Thank you for playing==============================");
		}
		

	}
}