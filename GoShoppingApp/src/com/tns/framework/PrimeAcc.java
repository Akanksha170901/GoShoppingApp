package com.tns.framework;

public  class PrimeAcc extends ShopAcc {
	public static boolean isPrime;
	
	

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
		// TODO Auto-generated constructor stub
		}
	
	public void bookProduct(float a) {System.out.println("Charges:"+charges);}
	




@Override
	public String toString() {
		return "PrimeAcc [isPrime()=" + isPrime() + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

public boolean isPrime() {
	return isPrime;
}

 private void setPrime(boolean isPrime) {
	 PrimeAcc.isPrime=isPrime;
 }
		// TODO Auto-generated method stub
		

}










