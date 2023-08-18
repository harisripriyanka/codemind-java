import java.util.Scanner;
public class tri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        double ta=0;
        if(s<=199){
            ta = s*1.20;
        }
        else if(s>=200 && s<400){
            ta = s*1.50;
        }
        else if(s>=400 && s<600){
            ta = s*1.80;
        }
        else if(s>=600){
            ta = s*2.00;
        }
        if(ta > 400){
            double sb = ta*0.15;
            ta = ta+sb;
        }
        else if(ta < 400){
            ta = ta+100;
        }
        System.out.printf("%.2f",ta);
        sc.close();
    }
}