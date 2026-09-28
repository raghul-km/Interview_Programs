public class ReverseString {

    public static void main(String[] args) {
        char[] str = {'j', 'a', 'v', 'a'};
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
    }
}
