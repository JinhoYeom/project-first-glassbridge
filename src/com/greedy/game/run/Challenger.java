package com.greedy.game.run;

import java.util.Scanner;

public class Challenger {

	Scanner sc = new Scanner(System.in);
	GlassBridge gbridge = new GlassBridge();
	Record record = new Record();
	GlassBridge gBridge = new GlassBridge();

	String challengername;
	int sucessnum = 0;

	public void crossBridge(String name) {
		challengername = name;
		gBridge.makingRightWay();
		while(true) {
			System.out.println("============ 유리 다리 건너기 ==========");
			System.out.println(challengername + "의 도전~~");
			System.out.println(sucessnum + "회 성공");
			System.out.println("1.왼쪽으로 간다!");
			System.out.println("2.오른쪽으로 간다!");
			System.out.println("3.포기하자");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : advanceRight();
				break;
			case 2 : advanceLeft(); 
				break;
			case 3 :char yn = giveUP();
			if(yn == 'y') {
				System.out.println("포기하셨습니다");
				System.out.println(sucessnum + "회 성공했습니다.");
				record.newbest(sucessnum);
				return;
			} else if(yn == 'n') {
				break;
			}else {
				System.out.println(" y 아니면 n을 입력하세요");
			}
			default : System.out.println("정확한 숫자를 입력해주세요");		
			break;
			}
		}

	}

	public char giveUP() {
		System.out.print("정말로 포기하겠습니까? (y/n)");
		char yn = sc.next().charAt(0);
		return yn;
	}
	
	public void advanceRight() {
		System.out.println("오른쪽으로 간다!");
		gbridge.thisWayIsRight(1);
	}
	
	public void advanceLeft() {
		System.out.println("왼쪽으로 간다!");
		gbridge.thisWayIsRight(2);
	}

}
