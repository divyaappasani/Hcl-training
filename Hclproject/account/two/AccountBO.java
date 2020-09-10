package com.account.two;

public class AccountBO {

	public FixedAccount getAccountDetail(String detail) {
		String[] accInfo = detail.split(",");
		FixedAccount fa=new FixedAccount(accInfo[0],Double.parseDouble(accInfo[1]),accInfo[2],Double.parseDouble(accInfo[3]),Integer.parseInt(accInfo[4]));
	    
		return fa;
	    }
}
