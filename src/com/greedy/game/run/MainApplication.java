package com.greedy.game.run;

import java.util.Scanner;

public class MainApplication {
	// 시작 화면
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Challenger chg = new Challenger();
		GlassBridge gBridge = new GlassBridge();


		while(true) {
			System.out.println("========= 메인 메뉴 ========= ");
			System.out.println(" 총 18개의 유리 다리를 건너야 합니다 ");
			System.out.println(" 왼쪽 혹은 오른쪽으로 갈 수 있으며");
			System.out.println(" 틀린 곳을 고리면 유리가 깨져 죽습니다");
			System.out.println("1. 도전");
			System.out.println("2. 종료");
			System.out.print("메뉴화면 선택 : ");
			int no  = sc.nextInt();

			switch(no) {
			case 1 : chg.makingName();
			gBridge.makingRightWay();
			chg.crossBridge();
			break;
			case 2 : System.out.println("게임을 종료합니다."); 
			return;
			default : System.out.println("정확한 숫자를 입력해 주세요");
			break;
			}


		}

	}

}