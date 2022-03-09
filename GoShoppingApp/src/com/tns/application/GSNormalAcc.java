package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	
	public GSNormalAcc() {
		super(accNo , accNm, deliveryCharges, deliveryCharges);
		
	}

	public void bookProduct(float charges) {
		System.out.println("your delivery charges are"+deliveryCharges);
		// TODO Auto-generated method stub
	
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getDeliveryCharges()=" + getDeliveryCharges()
				+ ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	

	

}
