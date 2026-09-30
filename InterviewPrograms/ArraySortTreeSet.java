import java.util.Set;
import java.util.TreeSet;

public class ArraySortTreeSet {
    public static void main(String[] args) {
        int[] array = {50,80,42,58,63,12,50,12,42};
        Set<Integer> set = new TreeSet<>();
        for(int num : array) {
            set.add(num);
        }
        System.out.print(set);
    }
}