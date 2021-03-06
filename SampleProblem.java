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
		
		//PrintWriter pw = new PrintWriter(new FileWriter(
		//		new File(String.format("ouput/%s.out"))));
		
		int numberOfPictures = in.nextInt();
		for (int t = 1; t <= numberOfPictures; t++) {
			
			String vh = in.next();
			System.out.print(vh);
			int numberOfTags = Integer.valueOf(in.next());
				
			System.out.print(numberOfTags);
			ArrayList<String> tags = new ArrayList<String>();
				
			for(int i = 1; i <= numberOfTags; i++) {
				tags.add(in.next());
			}
				
			if (vh == "H") {
				horizontal.add(tags);
			}
			else if (vh == "V") {
				vertical.add(tags);
			}
			
		}
		//pw.flush();
		//pw.close();
	}
	
}
