package Team1;
import java.util.Scanner;
public class homework1 {

	public static void main(String[] args) {
		boolean run = true;
		int RecentNumber=0;
		String[][] boardArray = new String[100][5];
		String space = "    ";
		Scanner scanner =new Scanner(System.in);
		String s = null;
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
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;

			case 2:
				
				System.out.print("제목: ");
				s = scanner.nextLine();
				
				break;

			case 3:
				
				break;

			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("종료");
				return;
			}
		}

	}

}
