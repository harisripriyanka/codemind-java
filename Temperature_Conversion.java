import java.util.Scanner;
public class temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = (c*1.8)+32;
        System.out.printf("%.2f",f);
    }
}