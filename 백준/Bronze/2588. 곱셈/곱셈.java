import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String b = sc.next();

		for (int i = 2; i >= 0; i--) {
			System.out.println((b.charAt(i) - '0') * a);
		}
		System.out.println(Integer.parseInt(b) * a);

		sc.close();
	}

}