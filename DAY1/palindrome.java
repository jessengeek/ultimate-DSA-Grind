package DAY1;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int myNum = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (myNum == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("it is a palindrome no.");

        } else {
            System.out.println("it is not a palindrome no.");
        }
    }

}
