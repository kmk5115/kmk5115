package kmk191210;

import java.util.Scanner;

public class kmk12101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int kmk;
		System.out.println("�Է��ϼ���");
		kmk = scan.nextInt();
		
		while( kmk > 0 ) {
			if(kmk %2 == 0) {
				System.out.print("¦��");
			}else {System.out.println("Ȧ��");
			}	kmk = scan.nextInt();
			}
		System.out.println("����");
		}
					
		
	}


