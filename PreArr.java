package Dif.Tests;
import org.jetbrains.annotations.NotNull;
//цикл
 public class PreArr {
    public static void main (int[] @NotNull [] arr) {
        System.out.println("\nmain:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

