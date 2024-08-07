package com.br.chap01_poly.shop;

import com.br.chap01_poly.model.vo.Desktop;
import com.br.chap01_poly.model.vo.NoteBook;
import com.br.chap01_poly.model.vo.Tablet;

// 전자제품 판매하는 기계
public class ElectronicShop1 { // 다형성 적용전
	
	// 세개의 제품객체를 담기 위한 필드
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;

	// 제품 추가용 메소드( 오버로딩 적용됨 )
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 제품 조회용 메소드
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
