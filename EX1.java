package ReadEx;

import java.io.*;

public class EX1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
String io = "C:\\Users\\2377126\\Desktop\\inp.txt";
String output = "C:\\Users\\2377126\\Desktop\\output";
 try {
	 removeSpecialCharacters(io , output);
	 System.out.println("Special Characters Removed");
 } catch (IOException e) {
	 System.out.println(e.getMessage());
 }
	}
	private static void removeSpecialCharacters(String io , String output) throws IOException {
	 try 
		 (BufferedReader reader = new BufferedReader(new FileReader(io));
		 BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
			 String line;
			 while((line = reader.readLine())!=null) {
				 String cleanedLine = removeSpecialCharactersFromLine(line);
				 writer.write(cleanedLine);
				 writer.newLine();
			 }
		 }
	 }

	private static String removeSpecialCharactersFromLine(String line) {
		return line.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s+", "");
	}
}
