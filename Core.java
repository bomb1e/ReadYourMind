import java.util.*;
public class Core {
	Scanner in = new Scanner(System.in);
	Random rnd = new Random();

	// Shuffles/Jumbles up an array of integers
	public void jumbler(String[] array) {
		for (int i = array.length - 1; i > 0 ; i--) {
		 	int index = rnd.nextInt(i + 1);
		 	String a = array[index];
		 	array[index] = array[i];
		 	array[i] = a;
		}
	}
	
	// Returns a random element from an array
	public String randomElementPicker(String[] array) {
		return array[rnd.nextInt(array.length)];
	}
	

	public int coreGame(String[][] cardArray){
		int sum = 0;
		for (int i = 0; i < cardArray.length; i++) {
			// jumble/shuffle cardArray[i][0]
		String[] workingArray = cardArray[i];
			jumbler(workingArray);
			// Show Card to user
			for (int j = 0; j < cardArray[i].length; j++) {
				System.out.print(workingArray[j] + " ");
				if(j%2==0){
					System.out.println("\n");
				}	
			}
		System.out.println("Is your selection in this card?\n (y/n)");
			if((in.nextLine()).equals("y")) {
				// add card[1] to sum if 'Yes'
				System.out.println(cardArray[i][0]);
				// sum = sum + cardArray[0][i] + " ";
			}	
		}
		return sum;
	}
	
}
