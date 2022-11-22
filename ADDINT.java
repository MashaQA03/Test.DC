package Dif.Tests;
import java.util.Scanner;

public class ADDINT {
    public static void main (String[] args) {
        System.out.println("Add Integer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum =sum + i;
            System.out.println(sum);
        }
    }
}
