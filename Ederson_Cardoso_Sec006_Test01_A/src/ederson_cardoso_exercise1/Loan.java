package ederson_cardoso_exercise1;

public abstract class Loan {
	private int loanNumber;
	private String customerName;
	private Date birthDate;
	private double loanAmount;
	private double yearlyRate;

	// getters and setters
	public int getLoanNumber() {
		return loanNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	// validate negative or zero value
	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException("Loan Amount cannot be negative nor zero");
		} else {
			this.loanAmount = loanAmount;
		}
	}

	public double getYearlyRate() {
		return yearlyRate;
	}

	// validate negative or zero value
	public void setYearlyRate(double yearlyRate) {
		if (yearlyRate <= 0) {
			throw new IllegalArgumentException("Yearly Rate cannot be negative nor zero");
		} else if (yearlyRate < 0.05 || yearlyRate > 0.07) {
			throw new IllegalArgumentException("Yearly Rate must be between 5% and 7%");
		} else {
			this.yearlyRate = yearlyRate;
		}

	}

	// default constructor with all parameters
	public Loan(int loanNumber, String customerName, Date birthDate, double loanAmount, double yearlyRate) {
		super();
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.birthDate = birthDate;
		setLoanAmount(loanAmount);
		setYearlyRate(yearlyRate);
	} // end constructor

	// overloaded constructor with loanNumber, customerName, birthDate
	public Loan(int loanNumber, String customerName, Date birthDate) {
		super();
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.birthDate = birthDate;
	} // end constructor

	// abstract method to calculate loan value
	public abstract double CalculateMonthlyLoanInstallment();

	@Override
	public String toString() {
		return String.format("Loan [loanNumber=%s, customerName=%s, birthDate=%s, loanAmount=%s, yearlyRate=%s]",
				loanNumber, customerName, birthDate, loanAmount, yearlyRate);
	}

} // end class
