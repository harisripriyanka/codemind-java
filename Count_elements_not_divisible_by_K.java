import java.util.Scanner;
public class point{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] Array = new int[n];
        int c = 0;
        for(int i = 0;i < n;i++){
            Array[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            if(Array[i]%k != 0){
                c++;
            }
        }
        System.out.println(c);
    }
}