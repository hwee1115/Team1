package Team1;
import java.util.Scanner;

public class JeongYeWon {

	public static void main(String[] args) {
		
		boolean run = true;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		int menunum=0; //��� ��ȣ
		int cnum=0; //������ ��ȣ
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.	��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("�޴�����: ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			if(menu == 1) { //��� ���
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("��ȣ           ����                    ����                    �۾���      ��ȸ��");
				System.out.println("---------------------------------------------------------------------------------------------------");
				for(int i=0;i<=menunum;i++) {
				System.out.println(boardArray[menunum][0]+"            "+boardArray[menunum][1]+"                  "+boardArray[menunum][2]+"                    "+boardArray[menunum][3]+"       "+boardArray[menunum][4]);
				}
			}
			else if(menu == 2) { //��� ����
				System.out.print("����: ");
				boardArray[menunum][1]=scanner.nextLine();
				System.out.print("����: ");
				boardArray[menunum][2]=scanner.nextLine();
				System.out.print("�۾���: ");
				boardArray[menunum][3]=scanner.nextLine();
				
				menunum++;
			}
			else if(menu == 3) { //�б�
				System.out.print("��ȣ: ");
				menunum = Integer.parseInt(scanner.next());
				System.out.println("����: "+boardArray[menunum][1]);
				System.out.println("����: "+boardArray[menunum][2]);
				System.out.println("�۾���: "+boardArray[menunum][3]);
				System.out.println("��ȸ��: "+boardArray[menunum][4]);
				boardArray[menunum][4] = boardArray[menunum][4] + 1;
			}
			else if( menu == 4) { //����
				
			}
			else if( menu == 5) { //����
				
			}
			else if( menu == 6) { //����
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
