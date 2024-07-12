package com.hw2.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;
	
	public void CookBook() {}

	

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}



	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.getTitle() + " / " + super.getAuthor() + " / " + super.getAuthor() + " / " + coupon;
	}
	
	

}
