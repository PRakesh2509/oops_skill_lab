import java.util.Scanner;
public class fahrenheitCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float F = sc.nextInt();
		float C = (F-32)*5.0f/9.0f;
		System.out.println("fahrenheit: "+F);
		System.out.println("Celsius: "+C);
	}
}
