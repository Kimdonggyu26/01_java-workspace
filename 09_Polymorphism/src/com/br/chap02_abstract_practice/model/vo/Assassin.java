package com.br.chap02_abstract_practice.model.vo;

public class Assassin extends GameCharacter{

	public Assassin() {}
	
	public Assassin(String name, int hp, int level, int exp) {
		super(name, hp, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("주먹으로 암살공격한다.");
		setExp(getExp() + 5);
	}

	@Override
	public void defence() {
		System.out.println("은둔해서 피한다.");
	}
	
	// toString 생략가능 => GameCharacter에 있는 toString 실행됨
	
	
	
}
