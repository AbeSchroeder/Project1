package com.revature.models;

import java.util.Arrays;

public class Reimb {
	private int reimbId;
	private int reimbAmmount;
	private boolean isSubmitted;
	private boolean isResolved;
	private int userId;
	private int statusId;
	private int typeId;
	private byte[] receipt;
	public byte[] getReceipt() {
		return receipt;
	}
	public void setReceipt(byte[] receipt) {
		this.receipt = receipt;
	}
	public int getReimbId() {
		return reimbId;
	}
	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}
	public int getReimbAmmount() {
		return reimbAmmount;
	}
	public void setReimbAmmount(int reimbAmmount) {
		this.reimbAmmount = reimbAmmount;
	}
	public boolean isSubmitted() {
		return isSubmitted;
	}
	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}
	public boolean isResolved() {
		return isResolved;
	}
	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isResolved ? 1231 : 1237);
		result = prime * result + (isSubmitted ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(receipt);
		result = prime * result + reimbAmmount;
		result = prime * result + reimbId;
		result = prime * result + statusId;
		result = prime * result + typeId;
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimb other = (Reimb) obj;
		if (isResolved != other.isResolved)
			return false;
		if (isSubmitted != other.isSubmitted)
			return false;
		if (!Arrays.equals(receipt, other.receipt))
			return false;
		if (reimbAmmount != other.reimbAmmount)
			return false;
		if (reimbId != other.reimbId)
			return false;
		if (statusId != other.statusId)
			return false;
		if (typeId != other.typeId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reimb [reimbId=" + reimbId + ", reimbAmmount=" + reimbAmmount + ", isSubmitted=" + isSubmitted
				+ ", isResolved=" + isResolved + ", userId=" + userId + ", statusId=" + statusId + ", typeId=" + typeId
				+ ", receipt=" + Arrays.toString(receipt) + "]";
	}
	
	
}
