package ederson_cardoso_exercise1;

public class LoanTest {

	public static void main(String[] args) {
		// Home 1
		int loanNumber1 = 101;
		String customerName1 = "Ederson Cardoso";
		Date birthDate1 = new Date(10, 12, 1980);
		double loanAmount1 = 1000.00;
		double yearlyRate1 = 0.06;
		double monthlyFee1 = 100.0;
		
		HomeEquityLoan home1 = new HomeEquityLoan(loanNumber1, customerName1, birthDate1, loanAmount1, yearlyRate1, monthlyFee1);
		System.out.println(home1.toString());

		// Home 2
		int loanNumber2 = 102;
		String customerName2 = "Patricia Silva";
		Date birthDate2 = new Date(04, 07, 1985);
		double loanAmount2 = 2000.00;
		double yearlyRate2 = 0.06;
		double monthlyFee2 = 200.0;
		
		HomeEquityLoan home2 = new HomeEquityLoan(loanNumber2, customerName2, birthDate2, loanAmount2, yearlyRate2, monthlyFee2);
		System.out.println(home2.toString());
		
		// Car 1
		int loanNumber3 = 103;
		String customerName3 = "Ederson Cardoso";
		Date birthDate3 = new Date(10, 12, 1980);
		double loanAmount3 = 1000.00;
		double yearlyRate3 = 0.06;
		double carMonthlyAmount3 = 300.0;
		
		CarLoan car1 = new CarLoan(loanNumber3,customerName3,  birthDate3, loanAmount3, yearlyRate3, carMonthlyAmount3);
		System.out.println(car1.toString());
		
		// Car 2
		int loanNumber4 = 104;
		String customerName4 = "Patricia Silva";
		Date birthDate4 = new Date(04, 07, 1985);
		double loanAmount4 = 2000.00;
		double yearlyRate4 = 0.06;
		double carMonthlyAmount4 = 400.0;
		
		CarLoan car2 = new CarLoan(loanNumber4,customerName4,  birthDate4, loanAmount4, yearlyRate4, carMonthlyAmount4);
		System.out.println(car2.toString());
		
	} // end main

} // end class
