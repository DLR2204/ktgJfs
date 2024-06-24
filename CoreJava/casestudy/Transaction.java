package casestudy;

import java.time.LocalDate;

public class Transaction {

	private byte transId;

	private LocalDate date;

	private long accNo;

	private String typeOfTrans;

	private float debits;

	private float credits;

	private float amount;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public byte getTransId() {
		return transId;
	}

	public void setTransId(byte transId) {
		this.transId = transId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getTypeOfTrans() {
		return typeOfTrans;
	}

	public void setTypeOfTrans(String typeOfTrans) {
		this.typeOfTrans = typeOfTrans;
	}

	public float getDebits() {
		return debits;
	}

	public void setDebits(float debits) {
		this.debits = debits;
	}

	public float getCredits() {
		return credits;
	}

	public void setCredits(float credits) {
		this.credits = credits;
	}

	public float getAmount() {
		return amount;
	}

	

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", date=" + date + ", accNo=" + accNo + ", typeOfTrans="
				+ typeOfTrans + ", debits=" + debits + ", credits=" + credits + ", amount=" + amount + "]";
	}

	public Transaction(byte transId, LocalDate date, long accNo, String typeOfTrans, float debits, float credits,
			float amount) {
		super();
		this.transId = transId;
		this.date = date;
		this.accNo = accNo;
		this.typeOfTrans = typeOfTrans;
		this.debits = debits;
		this.credits = credits;
		this.amount = amount;
	}

}
