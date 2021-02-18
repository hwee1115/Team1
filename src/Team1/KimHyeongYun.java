package Team1;

import java.util.Scanner;

public class KimHyeongYun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int sentenceNum = 0;
		int selectNum = 0;
		int readNum[] = new int[100];
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("메뉴선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 1을 읽었을 경우		
				
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("번호         제목                      내용                        글쓴이        조회수");
					System.out.println("---------------------------------------------------------------------------------");
				for(int i=0; i < sentenceNum; i++) {
					
					System.out.println(boardArray[sentenceNum][0] + "         " + boardArray[sentenceNum][1] + "                      " + boardArray[sentenceNum][2] + "                        " + boardArray[sentenceNum][3] + "        " + readNum[sentenceNum] );
				}
				
			} else if (selectNo == 2) { // 2. 생성(Create)
				for(int i = 0; i < 1; i++) {
					
					boardArray[sentenceNum][0] = "" + sentenceNum;
					System.out.print("제목: ");
					boardArray[sentenceNum][1] = scanner.nextLine();
					System.out.print("내용: ");
					boardArray[sentenceNum][2] = scanner.nextLine();
					System.out.print("글쓴이: ");
					boardArray[sentenceNum][3] = scanner.nextLine();
					sentenceNum++;

				}
				
				
			} else if (selectNo == 3) { // 3. 읽기(Read)
				
				System.out.print("번호선택> ");
				
				selectNum = Integer.parseInt(scanner.nextLine());
					for(int i = selectNum; i < selectNum + 1; i++) {
						// boardArray[selectNum][4] = "" ;
						readNum[i]++;
						System.out.println("번호: "  + boardArray[sentenceNum][0]);	
						System.out.println("제목: "  + boardArray[i][1]);
						System.out.println("내용: "  + boardArray[i][2]);
						System.out.println("글쓴이: "  + boardArray[i][3]);
						System.out.println("조회수: " + readNum[i]);
						
					}
				//Integer.scanner.nextInt();

			} else if (selectNo == 4) { // 4. 수정(Update)
				System.out.print("번호선택> ");
				selectNum = Integer.parseInt(scanner.nextLine());
				
					for(int i=selectNum; i < selectNum + 1; i++) {
						
						System.out.println("기존제목: "  + boardArray[sentenceNum][1]);
						System.out.println("수정제목: "  + boardArray[sentenceNum][1]);
						boardArray[sentenceNum][1] = scanner.nextLine();
						
						System.out.println("기존내용: "  + boardArray[sentenceNum][2]);
						System.out.println("수정내용: "  + boardArray[sentenceNum][2]);
						boardArray[sentenceNum][2] = scanner.nextLine();

						System.out.println("기존글쓴이: "  + boardArray[sentenceNum][3]);
						System.out.println("수정글쓴이: "  + boardArray[sentenceNum][3]);
						boardArray[sentenceNum][3] = scanner.nextLine();

					}
					
			} else if (selectNo == 5) { // 5. 삭제(Delete)
				System.out.print("번호선택> ");
				selectNum = Integer.parseInt(scanner.nextLine());
					for(int i=selectNum; i < selectNum + 1; i++) {
						// boardArray[selectNum][4] = "" ;
						
						boardArray[i][0] = null;	
						boardArray[i][1] = null;
						boardArray[i][2] = null;
						boardArray[i][3] = null;
						boardArray[i][4] = null;
						
					}
				
			} else if (selectNo == 6) { // 6. 종료
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
