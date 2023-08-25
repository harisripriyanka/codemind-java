import java.util.Scanner;
public class buy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] brray = new int[n];
        int a = 0;
        int b = 0;
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            brray[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
             a += array[i];
             b += brray[i];
        }
        int c = b-a;
        if(c > 0){
            System.out.println(c);
        }
        else{
            System.out.println(0);
        }
    }
        
}