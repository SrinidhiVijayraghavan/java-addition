package addition;import java.util.Scanner;

public class noarg {
	
		int  sum() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		return a+b;
		}
		public static void main(String args[]) {
			System.out.println("Sum="+new noarg().sum());
		}
		}


