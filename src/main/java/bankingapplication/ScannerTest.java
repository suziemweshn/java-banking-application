package bankingapplication;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[]args){
        Scanner myScanner=new Scanner(System.in);
                System.out.println("Enter a character:");
        char c= myScanner.next().charAt(0);
        System.out.println("Value " +"= " + c);

    }
}
