package com.greedy.game.run;

public class Record {
	
	Challenger chg = new Challenger();
	
	static int best = 0;
	static String bestname;


	public void nowBest() {
		System.out.println("현재 최고 기록은  " + bestname + "의 " + best + "번 다리");
	}

	public void newbBest(int record, String name) {
		if(best < record) {
			best = record;
			bestname = name;
		} 
		System.out.println("신기록 갱신 실패");
		
	}
	
	public void endGame() {
		int record = chg.sucessnum;
		String challengername = challengername;
		newBest(record, challengername);
		
		System.out.println(sucessnum + "회 성공했습니다.");
		record.newbest(sucessnum, challengername);
	}

}
