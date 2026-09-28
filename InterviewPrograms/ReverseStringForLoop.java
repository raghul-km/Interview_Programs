
public class ReverseStringForLoop {

    public static void main(String[] args) {
        String name = "madam";
        int start = 0;
        int end = name.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
