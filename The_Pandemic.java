import java.util.Scanner;
public class the{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==2){
            System.out.println("1");
        }
        else if(i==1){
            System.out.println("0");
        }
        else{
            System.out.println("2");
        }
    }
}