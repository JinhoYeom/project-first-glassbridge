package com.greedy.game.run;

public class GlassBridge {
	
	Record record = new Record();

	static int sucessnum = 0;
	static int[] rightWay = new int[18];
	
	public void makingRightWay() {
		for (int i = 0; i < rightWay.length; i++) {
			rightWay[i] = (int) (Math.random()*2 + 1);
		}
	}
	
	public void thisWayIsRight(int jump) {

		if(rightWay[sucessnum] == jump) {
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".......성공!");
			crossSucess();
			return;

		} else {
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".........................");
			System.out.println(".......깽그랑!!");
			crossFail();
			return;
		}

	}

	public int crossSucess() {
		sucessnum++;
		return 1;
	}

	public int crossFail() {
		sucessnum = 0;
		System.out.println("유리가 깨져 추락했습니다.");
		record.endGame(sucessnum);
		return 0;
	}

	public void checkAnswer() {
		for (int i = 0; i < rightWay.length; i++) {
		System.out.print(rightWay[i]);
		}
		System.out.println();
		
	} 
}
