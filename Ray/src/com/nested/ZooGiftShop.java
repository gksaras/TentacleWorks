package com.nested;

public class ZooGiftShop {

	abstract class SaleTodayOnly {  // Local class-private/abstract
		abstract int dollarsOff();
	}

	interface SaleToday {
	    abstract int dollarsOff();
	}
	
	public int admission(int basePrice) {
		
		SaleTodayOnly sale = new SaleTodayOnly() {
			@Override
			public int dollarsOff() {
				return 3;
			}
		}; // Don't forget the semicolon! r
		
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String[] args) {
	
		int base = 7;
		var z = new ZooGiftShop();
		int ans=z.admission(5);
		
		System.out.println(ans);
		
		SaleToday y = new SaleToday() {
			@Override
			public int dollarsOff() {
				return 2;
			}
		};
		System.out.println(base-y.dollarsOff());
	}
}
