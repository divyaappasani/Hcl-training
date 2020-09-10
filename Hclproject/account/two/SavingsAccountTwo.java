package com.account.two;

public class SavingsAccountTwo extends AccountTwo {

	protected double minimunBalance;
	public SavingsAccountTwo() {
		
	}
	public SavingsAccountTwo(String accountNumber,  double balance,String accountHolderName,double  minimunBalance) {
		super(accountNumber,balance, accountHolderName);
		this. minimunBalance= minimunBalance;
	}
	public double getMinimunBalance() {
		return minimunBalance;
	}
	public void setMinimunBalance(double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}
	
	
}
