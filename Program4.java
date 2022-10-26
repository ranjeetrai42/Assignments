
public class Program4 {

	public static void main(String[] args) {
		int n=15;
		for(int i=1;i<(n+3)/2;i++) {
			for(int j=1;j<n;j++) {
				if(j<=i||j>n-i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
