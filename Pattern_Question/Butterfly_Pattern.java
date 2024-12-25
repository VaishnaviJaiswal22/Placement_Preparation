package apna_college_Pattern_Question;

public class Butterfly_Pattern {

	public static void main(String[] args) {
		int n = 5;
		
		//upper halif
		for(int i = 1;i<=n;i++) {
			//first part
			for(int j = 1; j<=i ;j++) {
				System.out.print("*");
			}
			
			// for spaces
			int spaces = 2*(n-i);
			for(int j = 0;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//second part
			for(int j = 1; j<=i ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//lower half
		for(int i = n;i>=1;i--) {
			//first part
			for(int j = 1; j<=i ;j++) {
				System.out.print("*");
			}
			
			// for spaces
			int spaces = 2*(n-i);
			for(int j = 0;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			//second part
			for(int j = 1; j<=i ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

	}

}
