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
		List<List<String>> vertical;
		List<List<String>> horizontal;
		
		Scanner in = new Scanner(
				new File(String.format("a_example.txt")));
		
		PrintWriter pw = new PrintWriter(new FileWriter(
				new File(String.format("ouput/%s.out"))));
		
		int numberOfPictures = in.nextInt();
		for (int t = 1; t <= numberOfPictures; t++) {
			System.out.println(in.nextLine());
			
		}
		pw.flush();
		pw.close();
	}
	
}
