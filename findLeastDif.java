import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class findLeastDif {
	
	static void findLeastDifference(double[] a, int size) {
		

		double min = Math.abs(a[0] - a[size-1]);
		double low = a[0];
		double high = a[size-1];
		
		for (int i = 0; i<size-1; i++) {
			if(Math.abs(a[i+1] - a[i]) < min) {
				min = Math.abs(a[i+1] - a[i]);
				low = a[i];
				high = a[i+1];
			}
			
		}
		

		System.out.println("The numbers " + String.format("%.6f", low) + " and " + String.format("%.6f", high) + " are the closest pair with a difference of " + String.format("%.6f", (high-low)));
		
	}

	
}