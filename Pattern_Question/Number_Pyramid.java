package apna_college_Pattern_Question;

public class Number_Pyramid {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1;i<=n;i++) {
			//for spaces
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//for numbers
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

	}

}
