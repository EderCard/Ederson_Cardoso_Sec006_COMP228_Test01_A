package ederson_cardoso_exercise1;

public class HomeEquityLoan extends Loan {
	private double monthlyFee;

	// getters and setters
	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		if (monthlyFee <= 0) {
			throw new IllegalArgumentException("Monthly Fee cannot be negative nor zero");
		} else {
			this.monthlyFee = monthlyFee;
		}
	}

	// constructor with all parameters
	public HomeEquityLoan(int loanNumber, String customerName, Date birthDate, double loanAmount, double yearlyRate,
			double monthlyFee) {
		super(loanNumber, customerName, birthDate, loanAmount, yearlyRate);
		setMonthlyFee(monthlyFee);
	} // end constructor

	@Override
	public double CalculateMonthlyLoanInstallment() {
		return getLoanAmount() + getLoanAmount() * getYearlyRate() / 12;
	}

	@Override
	public String toString() {
		return String.format("%n%s HomeEquityLoan [monthlyFee=%s]", super.toString(), monthlyFee);
	}

} // end class
