import java.util.Scanner;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 1;j <= n-i;j++){
                System.out.printf("%d",j);
            }
            System.out.println();
        }
    }
}