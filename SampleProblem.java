import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleProblem {

	public static void main(String[] args) throws IOException {
		solve();
	}

	public static void solve() throws IOException {
		List<ArrayList<String>> vertical = new ArrayList<ArrayList<String>>();
		List<ArrayList<String>> horizontal = new ArrayList<ArrayList<String>>();
		
		Scanner in = new Scanner(
				new File(String.format("a_example.txt")));
		
		PrintWriter pw = new PrintWriter(new FileWriter(
				new File(String.format("ouput/%s.out"))));
		
		int numberOfPictures = in.nextInt();
		for (int t = 1; t <= numberOfPictures; t++) {
			String line = in.nextLine();
			String[] splitted = line.split(" ");
			String vh = splitted[0];
			int numberOfTags = Integer.valueOf(splitted[1]);
			//ArrayList<String> tags = new 
			
			for(int i = 1; i <= numberOfTags; i++) {
				
			}
			
			System.out.println();
			
		}
		pw.flush();
		pw.close();
	}
	
}
