package kmk191210;

public class kmk1210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int xs;
		int ys;
		int sum;
		
		for( x=1; x>=1; x++) {
			for( y=1; y<=20; y--) {
				xs = x * 4;
				ys = y * 5;
				sum= xs +ys;
				if(sum == 60) {
					System.out.println("x°ª"+x+"y°ª"+y);
				}System.out.println("");
			}
		}
	}

}
