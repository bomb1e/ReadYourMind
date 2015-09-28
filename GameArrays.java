
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class GameArrays {
	// FileToArray arrayCreator = new FileToArray();
	// public String list[] = arrayCreator.fileToArray("sampleinput.txt");
	// ArrayList<String> nameList = new ArrayList<>();
	// String listFile = "samplelist.txt";
	// public void readFile(){
 //        try {
 //            Scanner scanner = new Scanner(new File(listFile));
 //            while (scanner.hasNext()){
 //                nameList.add(scanner.nextLine());
 //            }
 //        } catch (IOException e) {
 //            e.printStackTrace();
 //        }
 //    }
 //    public String list[] = new String[nameList.size()];
     
 //    public void writeArray(){
 //    	for (int i = 0; i < nameList.size(); i++) {
 //        list[i] = nameList.get(i);
 //    	}
 //    }
    
	public String list[] = {"","Mascot","Roslynne","Kate","Kpano","Tsatsu","Mustapha"
						,"Yinka","Jumba","Yeboah", "Kayode","Edmond","Chidi"
						,"Bubu","Maxwell","Opeyemi","Julius","Law"
						,"Bernard","Tabitha","Patience","Eric","Samuel"
						,"Nana-Ama","Nyawira","Mary","Oluwasegun","Mukeli"
						,"Amanze","Ibukun","Paul","Chiamaka"};		
		String[] positionA = {"1",list[1],list[3],list[5],list[7],list[9],list[11],list[13],
							  list[15],list[17],list[19],list[21],list[23],list[25],
							  list[27],list[29],list[31]};
		
		String[] positionB = {"2",list[2],list[3],list[6],list[7],list[10],list[11],list[14],
							  list[15],list[18],list[19],list[22],list[23],list[26],
							  list[27],list[30],list[31]};
	

	
		String[] positionC = {"4",list[4],list[5],list[6],list[7],list[12],list[13],list[14],
							  list[15],list[20],list[21],list[22],list[23],list[28],
							  list[30],list[31],list[0]};
	

	
		String[] positionD = {"8",list[8],list[9],list[10],list[11],list[12],list[13],list[14],
							  list[15],list[24],list[25],list[26],list[27],list[28],
							  list[29],list[30],list[31]};
	
	

		String[] positionE = {"16",list[16],list[17],list[18],list[19],list[20],list[21],list[22],
							  list[23],list[24],list[25],list[26],list[27],list[28],
							  list[29],list[30],list[31]};
		String[] exitQuotes = {"'Come over,' she begged. 'I need you right now!' 'Just turn it off and on again,' he sighed. He hated these late night rebooty calls.","He enjoyed 3.141592 in a bed. He was Pi-sexual.","She left dazed - she had learned her first lesson. The square on the hypotenuse is equal to the sum of the squares on the other two sides.","She said she was turned on by dangerous men, so he started running with scissors.","'It's just too big!' she cried. 'It's never going to fit!' 'Of course it will,' he grinned, 'I've compressed the file.'","'I've been a very bad girl,' she said, biting her lip. 'I need to be punished.' 'Very well,' he said and installed Windows 10 on her laptop."};
		String[] noPlayQuotes = {"Somewhere out there is a tree, tirelessly producing oxygen so you can breathe. I think you owe it an apology. ","The last time I saw a face like yours I fed it a banana.","If laughter is the best medicine, your face must be curing the world.","If I wanted to kill myself I'd climb your ego and jump to your IQ.","I wasn't born with enough middle fingers to let you know how I feel about you.","Your birth certificate is an apology letter from the condom factory.","Roses are red, violets are blue, I have 5 fingers, the 3rd ones for you."};
		String[][] cardArray = {positionA,positionB,positionC,positionD,positionE};
}

		
	

	
	
