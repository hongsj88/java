package ex12.control2.switch_;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;
		Scanner scan = new Scanner(System.in);
				

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		종료:
		while(true) {

			//----- 메인메뉴 부분 ---------------------------
			
			System.out.print("┌────────────────────────┐\n");
			System.out.print("│      메인메뉴            │\n");	
			System.out.print("└────────────────────────┘\n");
			System.out.print("\t1. 성적입력");
			System.out.print("\t2. 성적출력");
			System.out.print("\t3. 종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("┌────────────────────────┐\n");
				System.out.print("│      성적입력            │\n");	
				System.out.print("└────────────────────────┘\n");
				
				do{
					System.out.print("\t국어1:");
					kor1 = scan.nextInt();
					if ((kor1 < 0 || 100 < kor1) )
						System.out.println("성적범위(0~100)를 벗어났습니다.");
					
				}while(kor1 < 0 || 100 < kor1) ;
				
				do{
					System.out.print("\t국어2:");
					kor2 = scan.nextInt();
					if ((kor2 < 0 || 100 < kor2) )
						System.out.println("성적범위(0~100)를 벗어났습니다.");
					
				}while(kor2 < 0 || 100 < kor2) ;
				
				do{
					System.out.print("\t국어3:");
					kor3 = scan.nextInt();
					if ((kor3 < 0 || 100 < kor3) )
						System.out.println("성적범위(0~100)를 벗어났습니다.");
					
				}while(kor3 < 0 || 100 < kor3) ;
				break;
			case 2 :
				//----- 성적 출력 부분 ---------------------------
				
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.print("┌────────────────────────┐\n");
				System.out.print("│      성적출력            │\n");	
				System.out.print("└────────────────────────┘\n");
				System.out.printf("국어1 : %3d\n",kor1);
				System.out.printf("국어2 : %3d \n",kor2);
				System.out.printf("국어3 : %3d \n",kor3);
				System.out.printf("총점 : %3d \n",total);
				System.out.printf("평균 : %6.2f \n",avg);
				break;
			case 3:
				System.out.println("Bye~~~~~");
				break 종료;
			default: 
				System.out.println("입력오류!! 1~3번까지만 선택하실 수 있습니다.");
			}
		
		}
	}

}
