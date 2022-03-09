package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges = 0;
	

	public float getCharges() {
		return charges;
		// TODO Auto-generated method stub
		
	}

	public GSPrimeAcc() {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Prime user charges are:" +charges);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", isPrime()=" + isPrime() + ", getAccNm()=" + getAccNm()
				+ ", getAccNo()=" + getAccNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}

	

	

	
	
	
		
	


	
	
	
	

	
