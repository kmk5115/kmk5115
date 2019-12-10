package kmk191210;

import java.util.Scanner;

public class kmk12102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//숫자 하나를 입력 받아서
		//1부터 입력받은 숫자까지 2의배수,3의배수를
		//제외한 총합 계산
		
		Scanner scan = new Scanner(System.in);
		int kmk;
		int i=0;
		int sum=0;
		System.out.println("입력하세요");
		kmk = scan.nextInt();
		
		while(i<kmk) {
			if(i % 2 == 0) {
			}else if(i % 3 ==0) {
			}else {
				sum += i;
			}i++;
	}System.out.println(sum);
	

	}
}
