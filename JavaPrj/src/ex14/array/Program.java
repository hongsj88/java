package ex14.array;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int[][] kors = new int[3][3];
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
				
				for(int i = 0;i<3;i++) {
					for(int j=0;j<3;j++) {
						do{
							System.out.printf("\t%d학년 국어%d :",i+1,j+1);
							kor1 = scan.nextInt();
							if ((kor1 < 0 || 100 < kor1) )
								System.out.println("성적범위(0~100)를 벗어났습니다.");
							
						}while(kor1 < 0 || 100 < kor1) ;
						kors[i][j] = kor1;
					}
				}
				
				
				break;
			case 2 :
				//----- 성적 출력 부분 ---------------------------
				
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.print("┌────────────────────────┐\n");
				System.out.print("│      성적출력            │\n");	
				System.out.print("└────────────────────────┘\n");
				System.out.println("─────────────────────────────");
				for(int i = 0;i<3;i++) {
					System.out.printf("<%d 학년 국어성적> --------\n", i+1);
					total = 0;
					avg = 0;
					for(int j=0;j<3;j++) {
						System.out.printf("국어%d : %3d\n",j+1,kors[i][j]);	
						total += kors[i][j];
						
					}
					
					System.out.printf("총점 : %3d \n",total);
					System.out.printf("평균 : %6.2f \n",total/3.01
							);
					System.out.println("─────────────────────────────");
				}
				
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
