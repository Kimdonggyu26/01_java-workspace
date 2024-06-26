package com.br.run;
/*
import com.br.variable.Variable;
import com.br.variable.KeyboardInput;
import com.br.variable.printf
*/
import com.br.variable.*;  //com.br.variable안에 있는 모든 클래스

public class RunClass {
	
	public static void main (String[] args) {
		Variable Vari = new Variable();
		
		//Vari.whyUseVariable();
		Vari.declareVariable();
		//Vari.constant();
		
		//KeyboardInput클래스의 inputTest1 메소드 호출
		KeyboardInput key = new KeyboardInput();
		//key.inputTest1();
		//key.practice1();
		//key.inputTest2();
		//key.inputTest3();
		//key.charAtTest();
		//key.practice2();
		
		
		//printf클래스의 printfTest 메소드 호출
		
		//Printf pr = new Printf();
		//pr.printfTest();
		
		//casting클래스의 autoCasting 메소드 호출
		Casting cast = new Casting();
		//cast.autoCasting();
		cast.forceCasting();
		
	
		
		
		
	}

}
