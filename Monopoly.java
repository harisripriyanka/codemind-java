import java.util.Scanner;
public class Codechef
{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- != 0){
		    int num1 = sc.nextInt();
		    int num2 = sc.nextInt();
		    int num3 = sc.nextInt();
		    if(num1 + num2 < num3 || num2 + num3 < num1 || num1 + num3 < num2)
		        System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}