import java.util.*;

class ScannerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1st number	:	");
		String s1 = sc.nextLine();

		System.out.println("2nd number	:	");
		String s2 = sc.next();


		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);

		int sum = (a+b);
		System.out.println("Sum	:	"+sum);
	}
}

