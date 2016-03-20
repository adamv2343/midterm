package com.cisc181.eNums;

public enum eMajor {
BUSINESS(0), COMPSI(1), CHEM(2), PHYSICS(3), NURSING(4);
    public int eMajor;

	private eMajor(int eMajor) {
		this.eMajor = eMajor;
	}

	public int getiMnbr() {
		return eMajor;
	}
	

}
