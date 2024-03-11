package java_stdin_and_stdout_I;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of integers to read
        int n = scanner.nextInt();

        // Complete the code to read n integers and print them on separate lines
        for (int i = 0; i < n; i++) {
            int integer = scanner.nextInt();
            System.out.println(integer);
        }

        // Close the scanner
        scanner.close();
    }
}
