package com.cg.bookmymovie.ewallet.ewallet.Ewallet;

import java.time.LocalDateTime;

public class Statement {
	private Integer transactionId;
	private String transactionType;
	private Double amount;
	private LocalDateTime DateTime;
	private String remarks;
	
	public Statement(Integer transactionId, String transactionType, Double amount, LocalDateTime dateTime,
			String remarks) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		DateTime = dateTime;
		this.remarks = remarks;
	}
	public Statement() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDateTime getDateTime() {
		return DateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		DateTime = dateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Statement [transactionId=" + transactionId + ", transactionType=" + transactionType + ", amount="
				+ amount + ", DateTime=" + DateTime + ", remarks=" + remarks + "]";
	}
}
