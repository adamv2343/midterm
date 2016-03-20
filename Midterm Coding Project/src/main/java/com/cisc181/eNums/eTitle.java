package com.cisc181.eNums;

public enum eTitle {
MR(0), MRS(1), MS(2);
	private int Title;

	private eTitle(int Title) {
		this.Title = Title;
	}

	public int getiTNbr() {
		return Title;
	}
	
}
