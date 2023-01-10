package Palindrome;

public class Palindrome {
    
    public boolean isPalindrome(int x) {

        int originalNumber = x;
        int reversedNumber = 0;

        // Get the reversed of x
        while (originalNumber != 0) {
            // reversed number * 10 plus the remainder
            reversedNumber = reversedNumber * 10 + originalNumber %10;
            // reduce the original number to remove fartheet integer
            originalNumber /= 10;
            
        }

        // Does the original number match the reversed number?
        if (x == reversedNumber && x >= 0) {
            System.out.println(x + " is a Palindrome");
            return true;
        }
        else {
            System.out.println(x + " is NOT a Palindrome");
            return false;
        }

    }

    public static void main(String[] args) {
        
        Palindrome test = new Palindrome();

        test.isPalindrome(0);
        test.isPalindrome(1234);
        test.isPalindrome(121);
        test.isPalindrome(-121);


    }

}
