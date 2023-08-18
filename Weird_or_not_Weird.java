import java.util.Scanner;
public class tar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("not weird");
        }
        else{
            System.out.println("weird");
        }
    }
}