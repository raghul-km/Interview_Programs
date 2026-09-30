public class ArmstrongNumber {
    public static void main (String[] args) {
        int num = 153;
        int sum = 0;
        int original = num;
        while (num>0){
            int digit = num%10;
            sum = sum+(digit*digit*digit);
            num=num/10;
        }
        if(sum ==original){
            System.out.print(original + " is an Armstrong number");
        } else {
            System.out.print(original + " is not an Armstrong number");
        }
    }
}