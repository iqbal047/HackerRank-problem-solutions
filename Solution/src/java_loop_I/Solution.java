package java_loop_I;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
