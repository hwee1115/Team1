package Team1;

import java.util.Scanner;

public class KimMyungHwi {

	public static void main(String[] args) {
		
		boolean run =true;
		String [][] boardArray = new String[100][5];
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("--------------------------");
			System.out.print("�޴�����> ");
			int choiceNum =Integer.parseInt(scanner.nextLine());
			if(choiceNum==1) {
				System.out.println("--------------------------");
			}
		}
	}

}
