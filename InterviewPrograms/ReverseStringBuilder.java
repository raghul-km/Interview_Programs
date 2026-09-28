
public class ReverseStringBuilder {

    public static void main(String[] args) {
        String str = "java";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.print(reverse);
    }
}