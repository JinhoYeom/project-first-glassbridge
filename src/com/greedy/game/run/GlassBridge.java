package com.greedy.game.run;

public class GlassBridge {
	
	Challenger chg = new Challenger();

	int count = 0;
	int[] rightWay = new int[18];


	public void makingRightWay() {

		for (int i = 0; i < rightWay.length; i++) {
			rightWay[i] = (int) (Math.random()*2) + 1;
		}

	}


	public int thisWayIsRight(int i) {

		if(rightWay[count] == i) {
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".......성공!");
			return crossSucess();

		} else {
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".......깽그랑!!");
			return crossFail();
		}

	}

	public int crossSucess() {
		count++;
		return 1;
	}

	public int crossFail() {
		count = 0;
		System.out.println("당신은 죽었습니다.");
		
		return 0;
	} 
}
