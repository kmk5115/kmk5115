package kmk191210;

import java.util.Scanner;

public class kmk12102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� �ϳ��� �Է� �޾Ƽ�
		//1���� �Է¹��� ���ڱ��� 2�ǹ��,3�ǹ����
		//������ ���� ���
		
		Scanner scan = new Scanner(System.in);
		int kmk;
		int i=0;
		int sum=0;
		System.out.println("�Է��ϼ���");
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
