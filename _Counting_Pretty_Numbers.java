import java.util.*;
public class counting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int c = 0;
            for(int j = m;j <= n;j++){
                int s = j%10;
                if(s == 2 || s == 3 || s == 9){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}