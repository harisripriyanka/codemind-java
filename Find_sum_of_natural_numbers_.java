import java.util.Scanner;
public class natural{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = (n*(n+1))/2;
        System.out.print(t);
    }
}