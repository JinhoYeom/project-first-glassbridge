package com.greedy.game.run;

public class GlassBridge {
	
	static int sucessnum = 0;
	static int[] answer = new int[18];
	
	public void makingRightWay() {
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random()*2 + 1);
		}
	}
	
	public int thisWayIsRight(int jump) {

		if(answer[sucessnum] == jump) {
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

	public static int crossSucess() {
		sucessnum++;
		return 1;
	}

	public static int crossFail() {
		System.out.println("유리가 깨져 추락했습니다.");
		System.out.println(sucessnum + "회 성공했습니다.");;
		sucessnum = 0;
		return 0;
	}

	public void checkAnswer() {
		for (int i = 0; i < answer.length; i++) {
		System.out.print(answer[i]);
		}
		System.out.println();
		
	} 
}
