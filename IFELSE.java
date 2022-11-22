package Dif.Tests;
import org.jetbrains.annotations.NotNull;
//if else
public class IFELSE {
    public static void main(String[] args) {
        int age = 25;
        if (age <= 3) {
            System.out.println("Baby");
        } else if (age >= 4 && age <= 17) {
            System.out.println("Teen");
        } else if (age >= 18 && age <= 40) {
            System.out.println("Adult");
        } else
            System.out.println("no comment");
    }
}
//        int a = 5;
//        if (a % 2 == 0) {
//           System.out.println("a is even");
//        } else {
//           System.out.println("a is odd");
//        }
//    }

