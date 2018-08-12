package addition;
import java.util.Scanner;

public class noreturnfun {
void sum(int a,int b ) {
	System.out.println("Sum=%d",a+b);
}
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 2 numbers");
int a=sc.nextInt();
int b=sc.nextInt();
new noreturnfun().sum(a,b);
sc.close();
}
}
