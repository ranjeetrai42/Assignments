
public class Program3 {

	public static void main(String[] args) {
		int n=15;
		int mid=7;
		int f=-1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(i==1 || i==n-1 || j==1||j==n-1||j<mid-f || j>mid+f ) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(f<mid) {
				f++;
			}
		}

	}

}
