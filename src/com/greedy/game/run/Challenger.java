package com.greedy.game.run;

import java.util.Scanner;

public class Challenger {
	Scanner sc = new Scanner(System.in);
	GlassBridge gbridge = new GlassBridge();
	GlassBridge gBridge = new GlassBridge();


	String challengername;
	int sucessnum;
	int sucess;


	public void crossBridge() {
		sucessnum = 0;
		while(true) {
			System.out.println("============ 유리 다리 건너기 ==========");
			System.out.println(challengername + "의 도전");
			System.out.println("성공 횟수 : " + sucessnum + "개");
			System.out.println("1.왼쪽으로 간다!");
			System.out.println("2.오른쪽으로 간다!");
			System.out.println("3.포기한다");
			System.out.print("행동 선택 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 :  sucess = advanceLeft();
			sucessnum += sucess;
			if (sucess == 0) {
				return;
			} else if (sucessnum == 18) {
				System.out.println("축하합니다!!" + challengername +"은/는 다리를 건너는데 성공했습니다!!");
				return;
			}
			break;
			case 2 :  sucess = advanceRight(); 
			sucessnum += sucess;
			if (sucess == 0) {
				return;
			}else if (sucessnum == 18) {
				System.out.println("축하합니다!!" + challengername +"은/는 다리를 건너는데 성공했습니다!!");
				return;
			}
			break;
			case 3 :int yn = giveUP();
			if(yn == 1) {
				System.out.println("유리 다리 건너기를 포기했습니다");
				System.out.println(sucessnum + "회 성공했습니다.");;
				return;
			} else if(yn == 2) {
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

	public int giveUP() {
		System.out.print("정말로 포기하겠습니까? (1 포기한다/2 아니다)");
		int yn = sc.nextInt();
		if(yn != 1 && yn != 2) {
			System.out.println(" 정확한 숫자를 입력해주세요 ");
			yn = sc.nextInt();
		}
		return  yn;
	}

	public int advanceLeft() {
		System.out.println("왼쪽으로 간다!");
		return gbridge.thisWayIsRight(1);
	}
	
	public int advanceRight() {
		System.out.println("오른쪽으로 간다!");
		return gbridge.thisWayIsRight(2);
	}


}