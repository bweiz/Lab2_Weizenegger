import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
			
			int n = 0;
			int min;
			int dif;
			List<Double> aR = new ArrayList<Double>();
			Scanner in = new Scanner(new File("lab2in.txt"));
			
			while(in.hasNext()) {
				aR.add(in.nextDouble());
				n++;
			}
			
			double[] a = new double[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = aR.get(i);
			}
			Arrays.sort(a);
			
			
			findLeastDif.findLeastDifference(a, n);
				
			}
			
	// Looking at my code, there are a number of different loops, one that populates the first array O(n), and one that sorts that array O(n). 
	// To actually find the smallest difference, it only iterates through once, which leads to a big O of O(n).  With everything else being
	// constants that leaves the program with a big O of O(n).
			
		
}
