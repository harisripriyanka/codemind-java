import java.util.Scanner;

public class KboatSpectrum
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char choice = in.next().charAt(0);
        switch (choice) {
            case 'V' :
                System.out.println("Violet");
                break;
            case 'v' :
                System.out.println("Violet");
                break;
                
            case 'I':
                System.out.println("Indigo");
                break;
            case 'i':
                System.out.println("Indigo");
                break;
                
            case 'B':
                System.out.println("Blue");
                break;
            case 'b':
                System.out.println("Blue");
                break;
                
            case 'G' :
                System.out.println("Green");
                break;
            case 'g' :
                System.out.println("Green");
                break;
                
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
                
            case 'O':
                System.out.println("Orange");
                break;
            case 'o':
                System.out.println("Orange");
                break;
                
            case 'R':
                System.out.println("Red");
                break;
            case 'r':
                System.out.println("Red");
                break;
                
            default:
                System.out.println("-1");
    }
}
}