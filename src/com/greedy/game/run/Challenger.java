package com.greedy.game.run;

import java.util.Scanner;

public class Challenger {

	Scanner sc = new Scanner(System.in);
	GlassBridge gbridge = new GlassBridge();
	Record record = new Record();
	GlassBridge gBridge = new GlassBridge();

	String challengername;
	int sucessnum;


	public void crossBridge() {
		sucessnum = 0;
		while(true) {
			System.out.println("============ 유리 다리 건너기 ==========");
			System.out.println(challengername + "의 도전~~");
			System.out.println(sucessnum + "번째 다리");
			System.out.println("1.왼쪽으로 간다!");
			System.out.println("2.오른쪽으로 간다!");
			System.out.println("3.포기하자");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 :  advanceLeft();
			break;
			case 2 : advanceRight(); 
			break;
			case 3 :char yn = giveUP();
			if(yn == 'y') {
				System.out.println("유리 다리 건너기를 포기했습니다");
				record.endGame(sucessnum);
				return;
			} else if(yn == 'n') {
				break;
			}
			case 9 : System.out.println("정답확인");
			gBridge.checkAnswer();
			break;
			default : System.out.println("정확한 숫자를 입력해주세요");		
			break;
			}
		}

	}
	public void makingName() {
		System.out.print ("도전자의 이름은?");
		challengername = sc.next();
	}

	public char giveUP() {
		System.out.print("정말로 포기하겠습니까? (y/n)");
		char yn = sc.next().charAt(0);
		return yn;
	}

	public void advanceLeft() {
		System.out.println("왼쪽으로 간다!");
		gbridge.thisWayIsRight(1);
	}
	
	public void advanceRight() {
		System.out.println("오른쪽으로 간다!");
		gbridge.thisWayIsRight(2);
	}


}
