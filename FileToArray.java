import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class FileToArray {

	public static void main (String[] args) {
		FileToArray reader = new FileToArray();
		if ( args.length == 0) 
			System.out.println( "No files specified" );
			reader.fileToArray(args[0]);
			// for ( String fileName : args) 
				
	}

	public void fileToArray(String fileName){
		String element;
		List<String> elementList = new ArrayList<String>();
		try {
			BufferedReader fileIn = new BufferedReader(new FileReader(fileName));
			
			while((element = fileIn.readLine()) != null){
				elementList.add(element);
		} 
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
		 String[] elementArray = elementList.toArray(new String[0]);
	}
}

	// public static void listFile ( String fileName ) {
	// 	Scanner fileIn = null;
	// 	System.out.println( "FILE: " + fileName );

	// 	try {
	// 		fileIn = new Scanner( new FileReader( fileName ));
	// 		while( fileIn.hasNextLine( )) {
	// 			String oneLine = fileIn.nextLine();
	// 			System.out.println( oneLine );
	// 		}
	// 	}
	// 	catch( IOException e) {
	// 		System.out.println(e);
	// 	}
	// 	finally {
	// 		// Close the Stream
	// 		if ( fileIn != null) {
	// 			fileIn.close();
	// 		}
	// 	}
	// }