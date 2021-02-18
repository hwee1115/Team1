package Team1;

import java.util.Scanner;

public class KimMyungHwi {

	public static void main(String[] args) {
		
		boolean run =true;
		String [][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("--------------------------");
			System.out.print("메뉴선택> ");
			int choiceNum =Integer.parseInt(scanner.nextLine());
			if(choiceNum==1) {
				System.out.println("--------------------------");
			}
		}
	}

}
