import java.util.Scanner;
public class unique{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        int k = 0;
        for(int i = 0;i < n;i++){
            int c = 0;
            for(int j = 0;j < n;j++){
                if(array[i] == array[j]){
                    c++;
                }
                }
                if(c == 1){
                    k = 1;
                    System.out.print(array[i] +" ");
            }
        }
        if(k==0){
            System.out.print("-1");
        }
    }
}