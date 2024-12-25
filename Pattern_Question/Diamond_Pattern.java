package apna_college_Pattern_Question;

public class Diamond_Pattern {

	public static void main(String[] args) {
		int n = 5;
		//upper half
		for(int i = 1;i<=n;i++) {
			//for spaces
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//first half
			for(int j = i;j>=1;j--) {
				System.out.print("*");
			}
			
			for(int j = 2;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//lower half
		for(int i = n;i>=1;i--) {
			//for spaces
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//first half
			for(int j = i;j>=1;j--) {
				System.out.print("*");
			}
			
			for(int j = 2;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}



	}

}
