package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;


public  class GSShopFactory extends ShopFactory{

	public GSPrimeAcc getNewPrimeAcc(int accNo,  String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	public GSNormalAcc getNewNormalAcc(int accNo,  String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float chareges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float chareges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

}
