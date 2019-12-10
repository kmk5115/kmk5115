package kmk191210;

import java.util.Scanner;

public class kmk12101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int kmk;
		System.out.println("입력하세요");
		kmk = scan.nextInt();
		
		while( kmk > 0 ) {
			if(kmk %2 == 0) {
				System.out.print("짝수");
			}else {System.out.println("홀수");
			}	kmk = scan.nextInt();
			}
		System.out.println("종료");
		}
					
		
	}


