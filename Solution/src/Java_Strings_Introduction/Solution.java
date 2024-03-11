package Java_Strings_Introduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // Sum of lengths of A and B
        int sumOfLengths = A.length() + B.length();
        System.out.println(sumOfLengths);

        // Check if A is lexicographically greater than B
        String lexicographicalComparison = (A.compareTo(B) > 0) ? "Yes" : "No";
        System.out.println(lexicographicalComparison);

        // Capitalize the first letter of A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        sc.close();
    }
}
