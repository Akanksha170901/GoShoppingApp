package com.tns.framework;

public  class ShopAcc {
	//Defining  variable and methods
	protected static int accNo;
	protected static String accNm;
	public float charges;
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
		
	
	//implement constructor for ShopAcc
	public ShopAcc(int accNo, String accNm, float charges) {
		
		ShopAcc.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	
	//implementing methods
	
	public void bookProduct(float charges) {System.out.println("Charges Are"+charges);}
	public void items(float charges) {System.out.println("Items Are delivered with"+charges);}
				
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
