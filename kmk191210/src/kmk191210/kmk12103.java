package kmk191210;

import java.util.Scanner;

public class kmk12103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k, m;
		int sum=0;
		System.out.println("숫자를 입력하세요");
		k = scan.nextInt();
		
		for(m=1; m<=k; m++) {
			
			if(m % 3 == 0) {
				
			}else if(m % 2 == 0) { 
				
			}else { 
				sum= sum+m;
			} 
			
		}System.out.println(sum);
		
		
		
		
		
		for (m=1; m<=k; m++) {
			if(m%2!=0 && m%3!=0) {
				sum = sum+m;
				}
		}
		System.out.println("합계 : " + sum);
		
	}

}
