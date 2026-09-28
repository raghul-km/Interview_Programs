
public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 12321;
        int rev = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        if (original == rev) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
