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

			System.out.println("1.��� | 2.���� | 3.�б� | 4.���� | 5.���� | 6.����");

			System.out.println("--------------------------------------------");

			System.out.print("�޴�����> ");
			
			s = scanner.nextLine();
			int menu = Integer.parseInt(s);
			switch(menu)
			{
			case 1:
				System.out.println("--------------------------------------------");
				
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ");

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
				
				System.out.print("����: ");
				s = scanner.nextLine();
				
				break;

			case 3:
				
				break;

			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("����");
				return;
			}
		}

	}

}
