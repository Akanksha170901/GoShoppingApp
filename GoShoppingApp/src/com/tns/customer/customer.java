package com.tns.customer;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				GSShopFactory gssfactory = new GSShopFactory();
				gssfactory.getNewPrimeAcc(123, "Akanksha", 1000, true);
				gssfactory.getNewNormalAcc(111, "Shruti", 1000, 50);
				
				
				// Step 2
				GSPrimeAcc gsprime = new GSPrimeAcc();
				gsprime.getAccNm();
				gsprime.getAccNo();
				gsprime.getCharges();
				// Step 4 / Step d.
				gsprime.bookProduct(1000);
				
				// Step 5 / Step e.
				gsprime.toString();
				GSNormalAcc gsnormal = new GSNormalAcc(); 
				gsnormal.getAccNm();
				gsnormal.getAccNo();
				gsnormal.getCharges();
				gsnormal.getDeliveryCharges();
			
				gsnormal.bookProduct(1000);
				gsnormal.toString();
			}
			
	}


