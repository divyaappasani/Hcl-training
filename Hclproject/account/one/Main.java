package com.account.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String accName, accNo, bankName,orgName,tinNumber;
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		int ch = Integer.parseInt(br1.readLine());
		if (ch == 1) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String str = br1.readLine();
			String[] accInfo = str.split(",");
			accName=accInfo[0];
			accNo=accInfo[1];
			bankName=accInfo[2];
			orgName=accInfo[3];
			Account sa = new SavingsAccount(accName, accNo, bankName, orgName);
			sa.display();
		}
		else if(ch==2) {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String str = br1.readLine();
			String[] accInfo = str.split(",");
			accName=accInfo[0];
			accNo=accInfo[1];
			bankName=accInfo[2];
			tinNumber=accInfo[3];
			Account ca=new CurrentAccount(accName, accNo, bankName, tinNumber);
			ca.display();
		}

	}

}
