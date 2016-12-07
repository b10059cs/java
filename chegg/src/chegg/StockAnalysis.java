package chegg;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class StockAnalysis {
	// creating variable as per requirement which is user understandable format
	static int lowProfit = 0;
	static int highProfit = 0;
	static int lowLoss = 0;
	static int highLoss = 0;
	static int totalProfitCnt = 0;
	static int totalLossCnt = 0;
	static Double totalProfit = 0.0;
	static Double totalLoss = 0.0;
// array for storing profit and loss
	static Double[] moreThenAverageProfit = new Double[366];
	static Double[] moreThenAverageLoss = new Double[366];

	public StockAnalysis() {
		// Filling both array with 0 at time of object creation of Stock
		// Analysis class
		Arrays.fill(moreThenAverageProfit, new Double(0));
		Arrays.fill(moreThenAverageLoss, new Double(0));
	}

	// Method for printing statics
	public static void printStatistics(StockDataBase s1, StockDataBase s2, int year) {
		Double stock1[] = s1.getStock();
		Double stock2[] = s2.getStock();
		DayConversion dc = new DayConversion();// creating Day conversion object
		System.out.println("Date \t Starting Value\t Ending Value");
		for (int i = 1; i < stock1.length; i++) {

			System.out.print(dc.dayConversion(i, year) + " " + i + "\t" + stock1[i] + "\t" + stock2[i] + "\t");
			Double plValue = stock2[i] - stock1[i];// getting loss or profit eg. +ve value as profit and -ve value as loss
			if (plValue > 0) {
				moreThenAverageProfit[i] = plValue;
				totalProfitCnt++;
				totalProfit = totalProfit + plValue;
			}
			if (plValue < 0) {
				moreThenAverageLoss[i] = Math.abs(plValue);
				totalLossCnt++;
				totalLoss = totalLoss + Math.abs(plValue);
			}

			if (plValue > (stock1[i] * 0.15)) {
				System.out.println("High Profit");
				highProfit++;
			} else if (plValue > 0 && plValue <= (stock1[i] * 0.15)) {
				System.out.println("Low Profit");
				lowProfit++;
			} else if (plValue < 0 && Math.abs(plValue) <= (stock1[i] * 0.15)) {
				System.out.println("Low Loss");
				lowLoss++;
			} else if (plValue < 0 && Math.abs(plValue) > (stock1[i] * 0.15)) {
				System.out.println("High Loss");
				highLoss++;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Number of days with Low Profit margin: " + lowProfit);
		System.out.println("Number of days with High Profit margin: " + highProfit);
		System.out.println("Number of days with Low Loss margin: " + lowLoss);
		System.out.println("Number of days with High Loss margin:" + highLoss);
		Double averageProfit = totalProfit / totalProfitCnt;
		Double averageLoss = totalLoss / totalLossCnt;
		System.out.println("YEARLY average profit: " + (averageProfit));
		System.out.println("YEARLY average loss: " + new DecimalFormat("##.##").format((averageLoss)));

		int moreThenAverageProfiltCnt = 0;
		int moreThenAverageLossCnt = 0;
		//getting count for more then average profit
		for (int i = 1; i < moreThenAverageProfit.length; i++) {
			if (moreThenAverageProfit[i] > averageProfit) {
				moreThenAverageProfiltCnt++;
			}
		}
		//getting count for more then average Loss
		for (int i = 1; i < moreThenAverageLoss.length; i++) {
			if (moreThenAverageLoss[i] > averageLoss) {
				moreThenAverageLossCnt++;
			}
		}
		System.out.println("Number of days profit is more than YEARLY average profit: " + moreThenAverageProfiltCnt);
		System.out.println("Number of days loss is more than the YEARLY average loss:" + moreThenAverageLossCnt);
	}

	public static void main(String args[]) {
		//creating two instance of StockDataBase
		StockDataBase s1 = new StockDataBase();
		StockDataBase s2 = new StockDataBase();
		StockAnalysis sa = new StockAnalysis();
		try {
			//please provide file path, path will be different for different Operating system
			File file = new File("/home/lalchand/Desktop/chegg/test.txt");
			Scanner sc = new Scanner(file);
			int year = sc.nextInt();
			sc.nextLine();
			int day = 1;
			//reading file
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String arr[] = line.split(" ");
				s1.setStock(day, Double.parseDouble(arr[0]));
				s2.setStock(day, Double.parseDouble(arr[1]));
				day++;
			}
			// calling statics method for printing
			printStatistics(s1, s2, year);

		} catch (Exception e) {
			System.out.println("Unable to open or read from file.");
		}
	}

}
