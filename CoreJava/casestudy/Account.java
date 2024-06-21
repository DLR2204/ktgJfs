package casestudy;

public class Account { //pojo
	
	private String accHolderName;
	
	private Long contactNo;
	
	private Long accNo;
	
	private String typeOfAccount;
	
	private float balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", contactNo=" + contactNo + ", accNo=" + accNo
				+ ", typeOfAccount=" + typeOfAccount + ", balance=" + balance + "]";
	}

	public Account(String accHolderName, Long contactNo, Long accNo, String typeOfAccount, float balance) {
		super();
		this.accHolderName = accHolderName;
		this.contactNo = contactNo;
		this.accNo = accNo;
		this.typeOfAccount = typeOfAccount;
		this.balance = balance;
	}
	
	

}
