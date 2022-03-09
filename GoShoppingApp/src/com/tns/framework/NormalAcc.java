package com.tns.framework;

public  class NormalAcc extends ShopAcc {
	protected static float deliveryCharges=100;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges = deliveryCharges;
	}

	public void bookProduct(float deliveryCharges) {System.out.println("Charges"+deliveryCharges);
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public float getDeliveryCharges()
	{
		return deliveryCharges;
	}
	

	
}
	
	
