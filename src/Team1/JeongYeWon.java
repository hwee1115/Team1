package Team1;
import java.util.Scanner;

public class JeongYeWon {

	public static void main(String[] args) {
		
		boolean run = true;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		int menunum=0; //목록 번호
		int cnum=0; //생성된 번호
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.	목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메뉴선택: ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			if(menu == 1) { //목록 출력
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("번호           제목                    내용                    글쓴이      조회수");
				System.out.println("---------------------------------------------------------------------------------------------------");
				for(int i=0;i<=menunum;i++) {
				System.out.println(boardArray[menunum][0]+"            "+boardArray[menunum][1]+"                  "+boardArray[menunum][2]+"                    "+boardArray[menunum][3]+"       "+boardArray[menunum][4]);
				}
			}
			else if(menu == 2) { //목록 생성
				System.out.print("제목: ");
				boardArray[menunum][1]=scanner.nextLine();
				System.out.print("내용: ");
				boardArray[menunum][2]=scanner.nextLine();
				System.out.print("글쓴이: ");
				boardArray[menunum][3]=scanner.nextLine();
				
				menunum++;
			}
			else if(menu == 3) { //읽기
				System.out.print("번호: ");
				menunum = Integer.parseInt(scanner.next());
				System.out.println("제목: "+boardArray[menunum][1]);
				System.out.println("내용: "+boardArray[menunum][2]);
				System.out.println("글쓴이: "+boardArray[menunum][3]);
				System.out.println("조회수: "+boardArray[menunum][4]);
				boardArray[menunum][4] = boardArray[menunum][4] + 1;
			}
			else if( menu == 4) { //수정
				
			}
			else if( menu == 5) { //삭제
				
			}
			else if( menu == 6) { //종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
