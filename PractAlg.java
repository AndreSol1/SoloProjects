import java.util.*;

public class PractAlg {
	
	public static void main(String[] args) {

	new PractAlg() {
		
	Scanner kb = new Scanner(System.in);
		
		Random ran = new Random();
		
		int N;
		
		int j = ran.nextInt(50);
		
		int l = ran.nextInt(50);
		
		public void vofN (j*l) {
	
		System.out.println("Enter an interger smaller than"+ N);
		
		
		System.out.println("if interger N = " + N );
		
		int a = kb.nextInt();
		
		int r =Math.max(a, N);
	
		int k = (a^r)/N;
	
		int aNS;
	
		
		System.out.println("Enter an interger smaller than"+ N );
		
			if(a < N) {
				aNS =((a^r/2 +1)*(a^r/2 -1)*k*j*l);
				
				System.out.println(aNS);
		}
			else {
				System.out.println("Invalid imput");
		}
			
	}
	
}
}
}
