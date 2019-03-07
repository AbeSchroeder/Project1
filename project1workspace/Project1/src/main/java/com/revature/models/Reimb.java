package com.revature.models;

import java.util.Arrays;

public class Reimb {
	private int reimbId;
	private int reimbAmmount;
	private int isSubmitted;
	private int isResolved;
	private int userId;
	private ReimbStatus status;
	private ReimbType type;
	private byte[] receipt;
	
	public Reimb() {}
	
	public Reimb(int reimbId, int reimbAmmount, int isSubmitted, int isResolved, int userId, ReimbStatus status,
			ReimbType type) {
		super();
		this.reimbId = reimbId;
		this.reimbAmmount = reimbAmmount;
		this.isSubmitted = isSubmitted;
		this.isResolved = isResolved;
		this.userId = userId;
		this.status = status;
		this.type = type;
	}
	
	public Reimb(int reimbId, int reimbAmmount, int isSubmitted, int isResolved, int userId, ReimbStatus status,
			ReimbType type, byte[] receipt) {
		super();
		this.reimbId = reimbId;
		this.reimbAmmount = reimbAmmount;
		this.isSubmitted = isSubmitted;
		this.isResolved = isResolved;
		this.userId = userId;
		this.status = status;
		this.type = type;
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
	public int getIsSubmitted() {
		return isSubmitted;
	}
	public void setIsSubmitted(int isSubmitted) {
		this.isSubmitted = isSubmitted;
	}
	public int getIsResolved() {
		return isResolved;
	}
	public void setIsResolved(int isResolved) {
		this.isResolved = isResolved;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ReimbStatus getStatus() {
		return status;
	}
	public void setStatus(ReimbStatus status) {
		this.status = status;
	}
	public ReimbType getType() {
		return type;
	}
	public void setType(ReimbType type) {
		this.type = type;
	}
	public byte[] getReceipt() {
		return receipt;
	}
	public void setReceipt(byte[] receipt) {
		this.receipt = receipt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isResolved;
		result = prime * result + isSubmitted;
		result = prime * result + Arrays.hashCode(receipt);
		result = prime * result + reimbAmmount;
		result = prime * result + reimbId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reimb [reimbId=" + reimbId + ", reimbAmmount=" + reimbAmmount + ", isSubmitted=" + isSubmitted
				+ ", isResolved=" + isResolved + ", userId=" + userId + ", status=" + status + ", type=" + type
				+ ", receipt=" + Arrays.toString(receipt) + "]";
	}
}
