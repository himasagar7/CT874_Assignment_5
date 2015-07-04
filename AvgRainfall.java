package assignment_5;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 *  The application  will calculate and return the average rainfall for the 12 months entered.
 */
public class AvgRainfall {

	public static void main(String[] args) {
		double[] rainfall = new double[12];
		double average;
		DecimalFormat f =  new DecimalFormat("#.##");
		rainfall = populateArray(rainfall);
		average = calculateAverage(rainfall);
		System.out.println("Annual average rainfall: " + f.format(average));
		}
	// Method to read inputs from user
	static double[] populateArray(double[] rainfall){
		Scanner s = new Scanner(System.in);
			for (int i = 0; i < 12; i++) {
			System.out.print("Enter rainfall in cm for month " + (i + 1) + " ");
			rainfall[i] = s.nextDouble();
		}
		s.close();
		return rainfall;
		
	}
	//Method to calculate average rainfall
	static double calculateAverage(double[] rainfall) {
		int sum = 0;
		for (double d : rainfall) {
			sum += d;
		}
		return sum / 12;
	}

}
