package ederson_cardoso_exercise1;

public class CarLoan extends Loan {
	private double carMonthlyAmount;

	// getters and setters
	public double getCarMonthlyAmount() {
		return carMonthlyAmount;
	}

	public void setCarMonthlyAmount(double carMonthlyAmount) {
		if (carMonthlyAmount <= 0) {
			throw new IllegalArgumentException("Car Monthly Amount cannot be negative nor zero");
		} else {
			this.carMonthlyAmount = carMonthlyAmount;
		}
	}

	// constructor with all parameters
	public CarLoan(int loanNumber, String customerName, Date birthDate, double loanAmount, double yearlyRate,
			double carMonthlyAmount) {
		super(loanNumber, customerName, birthDate, loanAmount, yearlyRate);

		setCarMonthlyAmount(carMonthlyAmount);

	} // end constructor

	@Override
	public double CalculateMonthlyLoanInstallment() {
		return getLoanAmount() + getLoanAmount() * getYearlyRate() / 12 + getCarMonthlyAmount();
	}

	@Override
	public String toString() {
		return String.format("%n%s CarLoan [carMonthlyAmount=%s]", super.toString(), carMonthlyAmount);
	}

} // end class
