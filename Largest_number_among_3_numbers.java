import java.util.Scanner;
public class jaa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.printf("%d",a);
        }
        else if(b>=a && b>=c){
            System.out.printf("%d",b);
        }
        else{
            System.out.printf("%d",c);
        }
    }
}