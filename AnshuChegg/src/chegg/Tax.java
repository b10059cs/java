package chegg;

public class Tax {

	public static void main(String args[]) {
		/* Variable declaration with initializing */
		int federalTaxableIncome = 80000;
		int federalTaxableRate = 28;
		int stateDeductible = 10000;
		int stateTaxRate = 15;
		double stateTaxBase;
		double stateTaxOwed;

		/* calculating federalTax based on formula */
		double federalTax = (federalTaxableIncome * federalTaxableRate) / 100;
		/* calculating stateTaxBase based on formula */
		stateTaxBase = federalTax - stateDeductible;
		/* calculating stateTaxOwed based on formula */
		stateTaxOwed = (stateTaxBase * stateTaxRate) / 100;

		/* Printing stateTaxOwed value after calculation */
		System.out.println("State tax owed is " + stateTaxOwed);

	}
}
