package Java_Int_to_String;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = Integer.toString(n);

        if (s != null) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        scanner.close();
    }
}
