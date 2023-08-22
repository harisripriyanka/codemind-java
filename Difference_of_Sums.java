import java.util.Scanner;
public class pro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1;i <= n;i++){
            sum1 += i*i;
            sum2 += i;
        }
        System.out.print(sum2*sum2-sum1);
    }
}