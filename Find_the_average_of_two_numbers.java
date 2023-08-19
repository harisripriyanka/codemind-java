import java.util.Scanner;
public class two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float avg = (a+b)/2;
        System.out.printf("%.4f",avg);
    }
}