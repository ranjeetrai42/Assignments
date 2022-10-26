
public class Program1 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<34;j++) {
				if(j==1||j==3||j==7||j==9||j==14||j==17||j==19||j==24||j==27||j==29||j==33) {
					if((j==14||j==17)&&i==5) {
						System.out.print(" ");
					}
					else if((j==24||j==27)&&(i==1||i==5)) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else if(j>3 && j<7 || j>29 && j<33) {
					if(j-2==i||j-28==i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else if(i==3&&(j==10||j==11)) {
					System.out.print("*");
				}
				else if(j>=19&&j<=22) {
					if(i-2==j-19) {
						System.out.print("*");
					}
					else if(((i==1||i==3)&&j!=22)||(j==22 && i==2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else if(i==1||i==5) {
					if((j>=9 && j<=12)||(j>14 && j<17 && i!=1)||(j>24&&j<27)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
