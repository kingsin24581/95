import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Attenden {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Total number of classes attended:");
        double Amount = scan.nextInt();
        double i = Amount * 0.8;
        System.out.print("Amount of times which student comes late:");
        double late = scan.nextInt();
        double lat = late /2;
        System.out.print("Amount of times which student was absent:");
        double absent = scan.nextInt();
        double total = Amount-lat-absent;
        if (total>=i){
            System.out.println("The student can take the exam:" +total);
        }
        else  {
            System.out.println("The student cannot take the exam:" +total);
        }
    }
}