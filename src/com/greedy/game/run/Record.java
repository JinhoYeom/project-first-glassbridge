package com.greedy.game.run;

public class Record {
	
	static int best = 0;


	public void nowBest() {
		System.out.println("현재 최고 기록은 : " + best + "번 다리");
	}

	public void newbest(int sucessnum) {
		if(best < sucessnum) {
			best = sucessnum;
		} 
		
	}

}
