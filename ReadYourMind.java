import java.util.Scanner;

public class ReadYourMind{
	
	public static void main(String args[]){
		GameArrays elementArray = new GameArrays();
		Core core = new Core();
		//This is the first part. It includes the welcome address, username, choice of play and leads to the main game.
		int choice;
		int sum = 0;
		String user;
		Scanner input = new Scanner(System.in);
		// Scanner input2 = new Scanner(System.in);
		// Scanner input3 = new Scanner(System.in);
		System.out.println("Welcome to MindReader Game.");
		System.out.println("Do you want to play MindReader?");

		System.out.println("1. YES");
		System.out.println("2. NO");
		choice = input.nextInt();

		

		if(choice == 1){
			System.out.println("Thanks for opting to play MindReader.");
			System.out.println("Enter your username");
			user = input.nextLine();

			System.out.println("Choose List\n 1.EiTs");
			System.out.println("Here is the List. Pick a name and keep it a secret");
			System.out.println("===================================================");
			
			for (int i=1; i < elementArray.list.length; i++) {
				System.out.print(elementArray.list[i] + ", ");
				if(i%5==0){
					System.out.println("\n");
				}
			}
			System.out.print("\n");
			System.out.println("===================================================");	
			
				sum = core.coreGame(elementArray.cardArray);
				System.out.println(user + " picked " + elementArray.list[sum]);		
		}

		else if (choice==2){
			System.out.println("You have opted to exit MindReader.");
			System.out.println("Thank you and do come again");
		}

	}
}