package com.account.two;

public class FixedAccount extends SavingsAccountTwo {
	private int lockingPeriod;
	public FixedAccount() {
		
	}
	public FixedAccount(String accountNumber,double balance, String accountHolderName, double minimunBalance,int lockingPeriod) {
		super(accountNumber, balance,accountHolderName,minimunBalance);
		this.lockingPeriod=lockingPeriod;
	}
	public int getLockingPeriod() {
		return lockingPeriod;
	}
	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

}
