package addition;
import java.util.Scanner;

public class noretnoarg {
	
		public void sum() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("Sum=%d",a+b);
		sc.close();
		} 
		public static void main(String args[]) {
			new noretnoarg().sum();
		}
		}


