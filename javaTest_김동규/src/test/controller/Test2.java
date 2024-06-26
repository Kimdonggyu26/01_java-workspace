package test.controller;

public class Test2 {

	public static void main(String[] args) {

		for(int dan = 2; dan < 6; dan++){
			for(int su = 1; su <= 9; su++) {
				if(dan  % 2 == 1 && su % 2 == 1) {	
			System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
		}
	}

	} //1e
}
