package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("구디", "진돗개", 15);
		a[1] = new Dog("뚱이", "푸들", 12);
		a[2] = new Cat("레오", "모름", "집", "black");
		a[3] = new Dog("가을", "포메", 8);
		a[4] = new Cat("가산", "고양이", "집", "white");
		
		for(int i = 0; i < a.length; i++) {
			a[i].Speak();
		}

	}

}
