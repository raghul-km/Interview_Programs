public class RemoveDuplicateCharacter {
    public static void main (String[] args) {
        String str = "programming";
        String result = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            boolean isDuplicate = false;
            for(int j=0; j<i; j++) {
                if(str.charAt(j) == ch) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
            result = result+ch;
            }
        }
        System.out.print(result);
    }
}