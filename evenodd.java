import java.util.Scanner;
public class evenodd {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Value 1: "+a);
		if(a % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("odd number");
		}
	}	
}