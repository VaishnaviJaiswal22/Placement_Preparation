package apna_college_Pattern_Question;

public class Floyds_Triangle {

	public static void main(String[] args) {
		int number = 1;
		for(int i = 0;i<5;i++) {
			for(int j = 0 ;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
