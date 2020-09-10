package com.account.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTwo {

	public static void main(String[] args) throws IOException,NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter account Detail:");
		String str = br.readLine();
		System.out.println("Account Details:");
		AccountBO o1 = new AccountBO();
		FixedAccount f=o1.getAccountDetail(str);
		System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
				"Minimum balance", "Locking period");
		System.out.println(f.getAccountNumber()+"\t\t"+f.getBalance()+"\t\t"+f.getAccountHolderName()+"\t\t"+f.getMinimunBalance()+"\t\t"+f.getLockingPeriod());
	
	}

}
