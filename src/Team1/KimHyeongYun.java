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
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("�޴�����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 1�� �о��� ���		
				
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("��ȣ         ����                      ����                        �۾���        ��ȸ��");
					System.out.println("---------------------------------------------------------------------------------");
				for(int i=0; i < sentenceNum; i++) {
					
					System.out.println(boardArray[sentenceNum][0] + "         " + boardArray[sentenceNum][1] + "                      " + boardArray[sentenceNum][2] + "                        " + boardArray[sentenceNum][3] + "        " + readNum[sentenceNum] );
				}
				
			} else if (selectNo == 2) { // 2. ����(Create)
				for(int i = 0; i < 1; i++) {
					
					boardArray[sentenceNum][0] = "" + sentenceNum;
					System.out.print("����: ");
					boardArray[sentenceNum][1] = scanner.nextLine();
					System.out.print("����: ");
					boardArray[sentenceNum][2] = scanner.nextLine();
					System.out.print("�۾���: ");
					boardArray[sentenceNum][3] = scanner.nextLine();
					sentenceNum++;

				}
				
				
			} else if (selectNo == 3) { // 3. �б�(Read)
				
				System.out.print("��ȣ����> ");
				
				selectNum = Integer.parseInt(scanner.nextLine());
					for(int i = selectNum; i < selectNum + 1; i++) {
						// boardArray[selectNum][4] = "" ;
						readNum[i]++;
						System.out.println("��ȣ: "  + boardArray[sentenceNum][0]);	
						System.out.println("����: "  + boardArray[i][1]);
						System.out.println("����: "  + boardArray[i][2]);
						System.out.println("�۾���: "  + boardArray[i][3]);
						System.out.println("��ȸ��: " + readNum[i]);
						
					}
				//Integer.scanner.nextInt();

			} else if (selectNo == 4) { // 4. ����(Update)
				System.out.print("��ȣ����> ");
				selectNum = Integer.parseInt(scanner.nextLine());
				
					for(int i=selectNum; i < selectNum + 1; i++) {
						
						System.out.println("��������: "  + boardArray[sentenceNum][1]);
						System.out.println("��������: "  + boardArray[sentenceNum][1]);
						boardArray[sentenceNum][1] = scanner.nextLine();
						
						System.out.println("��������: "  + boardArray[sentenceNum][2]);
						System.out.println("��������: "  + boardArray[sentenceNum][2]);
						boardArray[sentenceNum][2] = scanner.nextLine();

						System.out.println("�����۾���: "  + boardArray[sentenceNum][3]);
						System.out.println("�����۾���: "  + boardArray[sentenceNum][3]);
						boardArray[sentenceNum][3] = scanner.nextLine();

					}
					
			} else if (selectNo == 5) { // 5. ����(Delete)
				System.out.print("��ȣ����> ");
				selectNum = Integer.parseInt(scanner.nextLine());
					for(int i=selectNum; i < selectNum + 1; i++) {
						// boardArray[selectNum][4] = "" ;
						
						boardArray[i][0] = null;	
						boardArray[i][1] = null;
						boardArray[i][2] = null;
						boardArray[i][3] = null;
						boardArray[i][4] = null;
						
					}
				
			} else if (selectNo == 6) { // 6. ����
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
	}

}
