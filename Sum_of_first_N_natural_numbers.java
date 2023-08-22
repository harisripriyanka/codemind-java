import java.util.Scanner;
public class pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1;i <= n;i++){
            i = (n*(n+1))/2;
            System.out.print(i);
        }
    }
}