public class RemoveDuplicateArray {
    public static void main (String[] args) {
        int[] array = {10, 50, 40, 10, 20, 60, 40, 20};
        for(int i=0; i<=array.length; i++) {
            boolean isDuplicate = false;
            for(int j=0; j<i; j++) {
                if(array[i] == array[j]) {
                    boolean isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}