package Team1;
import java.util.Scanner;
public class OhWonjae {

	public static void main(String[] args) {
		boolean run = true;
		int MaxNumber = 100;
		int RecentNumber=100;
		String[][] boardArray = new String[100][5];
		String space = "    ";
		Scanner scanner =new Scanner(System.in);
		String s = null;
		int number=0;
		while(run)
		{
			System.out.println("--------------------------------------------");

			System.out.println("1.목록 | 2.생성 | 3.읽기 | 4.수정 | 5.삭제 | 6.종료");

			System.out.println("--------------------------------------------");

			System.out.print("메뉴선택> ");
			
			s = scanner.nextLine();
			int menu = Integer.parseInt(s);
			switch(menu)
			{
			case 1:
				System.out.println("--------------------------------------------");
				
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회");

				System.out.println("--------------------------------------------");
				for(int i=0; i< boardArray.length; i++)
				{
					System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
					
				}
				//메뉴로
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;

			case 2:
				// 번호
				RecentNumber--;
				boardArray[RecentNumber][0] =  ""+(MaxNumber - RecentNumber);
				// 제목
				System.out.print("제목: ");
				s = scanner.nextLine();
				boardArray[RecentNumber][1] =  ""+s;
				
				// 내용
				System.out.print("내용: ");
				s = scanner.nextLine();
				boardArray[RecentNumber][2] =  ""+s;
				
				// 글쓴이
				System.out.print("글쓴이: ");
				s = scanner.nextLine();
				boardArray[RecentNumber][3] =  ""+s;
				
				// 조회수
				boardArray[RecentNumber][4] =  ""+0;
				// 메뉴로
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;

			case 3:
				
				System.out.print("번호 ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// 조회수 증가
				int views = Integer.parseInt(boardArray[MaxNumber-number][4]);
				views++;
				boardArray[MaxNumber-number][4] = ""+views;
					System.out.print("제목: ");
					System.out.println(boardArray[MaxNumber-number][1]);
					System.out.println(boardArray[MaxNumber-number][2]);
					System.out.println(boardArray[MaxNumber-number][3]);
					System.out.println(boardArray[MaxNumber-number][4]);
					// 메뉴로
					s = scanner.nextLine();
					if(s.equals("\n"))
					{
						continue;
					}
				break;

			case 4:
				// 번호확인
				System.out.print("번호 ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				System.out.print("기존제목: ");
				String pretitle = boardArray[MaxNumber-number][1];
				System.out.println(pretitle);
				System.out.print("수정제목: ");
				s = scanner.nextLine();
				System.out.println(s);
				// 바로 엔터 누른거 아니면 해당내용으로 수정
				if(s.equals(""))
				{
					boardArray[MaxNumber-number][1] = pretitle;
				}
				else
				{
					boardArray[MaxNumber-number][1] = s;
				}
				
				System.out.print("기존내용: ");
				String precontent = boardArray[MaxNumber-number][2];
				System.out.println(precontent);
				System.out.print("수정내용: ");
				s = scanner.nextLine();
				// 바로 엔터 누른거 아니면 해당내용으로 수정
				if(s.equals(""))
				{
					boardArray[MaxNumber-number][2] = precontent;
				}
				else
				{
					boardArray[MaxNumber-number][2] = s;
				}
				
				// 메뉴로
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;
			case 5:
				// 번호확인
				System.out.print("번호 ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				for(int i=0; i<boardArray[0].length; i++)
				{
					boardArray[MaxNumber-number][i] = null;
				}
				// 메뉴로
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;
			case 6:
				System.out.println("종료");
				return;
			}
		}

	}

}
