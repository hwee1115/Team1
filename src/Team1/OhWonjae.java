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
				//���� ������
				if(boardArray[99][0]==null)
				{
					System.out.println("�����ϴ� ���� �����ϴ�. ������ �ּ���.");
				}
				for(int i=0;i< boardArray.length; i++)
				{
					System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
					
				}
				//�޴���
				System.out.println("�޴��� ���÷��� ���͸� �����ּ���.");
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;

			case 2:
				//�Խ��� �� á����
				if(RecentNumber<0)
				{
					System.out.println("�Խ����� �� á���ϴ�. �Ϻ� �Խù��� ������ �ּ���.");
				}
				// �Խ��� �ڸ� ������ ����
				else
				{
					// ��ȣ
					RecentNumber--;
					boardArray[RecentNumber][0] =  ""+(MaxNumber - RecentNumber);
					// ����
					System.out.print("����: ");
					s = scanner.nextLine();
					boardArray[RecentNumber][1] =  ""+s;
					
					// ����
					System.out.print("����: ");
					s = scanner.nextLine();
					boardArray[RecentNumber][2] =  ""+s;
					
					// �۾���
					System.out.print("�۾���: ");
					s = scanner.nextLine();
					boardArray[RecentNumber][3] =  ""+s;
					
					// ��ȸ��
					boardArray[RecentNumber][4] =  ""+0;
				}
				
				// �޴���
				System.out.println("�޴��� ���÷��� ���͸� �����ּ���.");
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;

			case 3:
				//��ȣȮ��
				System.out.print("��ȣ ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// �߸��� �ѹ� 
				if(number<0 || number >99 ||boardArray[MaxNumber-number][0]==null )
				{
					System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
				}
				// ����ε� �ѹ���
				else
				{
					// ��ȸ�� ����
					int views = Integer.parseInt(boardArray[MaxNumber-number][4]);
					views++;
					boardArray[MaxNumber-number][4] = ""+views;
						System.out.println("��ȣ : " + boardArray[MaxNumber-number][1]);
						System.out.println("���� : " + boardArray[MaxNumber-number][2]);
						System.out.println("���� : " + boardArray[MaxNumber-number][3]);
						System.out.println("��ȸ�� : " + boardArray[MaxNumber-number][4]);
				}
					// �޴���
					System.out.println("�޴��� ���÷��� ���͸� �����ּ���.");
					s = scanner.nextLine();
					if(s.equals("\n"))
					{
						continue;
					}
				break;

			case 4:
				// ��ȣȮ��
				System.out.print("��ȣ ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// �߸��� �ѹ� 
				if(number<0 || number >99 ||boardArray[MaxNumber-number][0]==null )
				{
					System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
				}
				// ����ε� �ѹ���
				else
				{
					System.out.print("��������: ");
					String pretitle = boardArray[MaxNumber-number][1];
					System.out.println(pretitle);
					System.out.print("��������: ");
					s = scanner.nextLine();
					System.out.println(s);
					// �ٷ� ���� ������ �ƴϸ� �ش系������ ����
					if(s.equals(""))
					{
						boardArray[MaxNumber-number][1] = pretitle;
					}
					else
					{
						boardArray[MaxNumber-number][1] = s;
					}
					
					System.out.print("��������: ");
					String precontent = boardArray[MaxNumber-number][2];
					System.out.println(precontent);
					System.out.print("��������: ");
					s = scanner.nextLine();
					// �ٷ� ���� ������ �ƴϸ� �ش系������ ����
					if(s.equals(""))
					{
						boardArray[MaxNumber-number][2] = precontent;
					}
					else
					{
						boardArray[MaxNumber-number][2] = s;
					}
				}
				
				
				// �޴���
				System.out.println("�޴��� ���÷��� ���͸� �����ּ���.");
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;
			case 5:
				// ��ȣȮ��
				System.out.print("��ȣ ");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// �߸��� �ѹ� 
				if(number<0 || number >99 ||boardArray[MaxNumber-number][0]==null )
				{
					System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
				}
				// ����ε� �ѹ���
				else
				{
					// ����
					for(int i=0; i<boardArray[0].length; i++)
					{
						boardArray[MaxNumber-number][i] = null;
					}
				}
				// �޴���
				System.out.println("�޴��� ���÷��� ���͸� �����ּ���.");
				s = scanner.nextLine();
				if(s.equals("\n"))
				{
					continue;
				}
				break;
			case 6:
				System.out.println("�����մϴ�");
				return;
			}
		}

	}

}
