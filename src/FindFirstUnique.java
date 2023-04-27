import com.sun.source.tree.BreakTree;

import java.util.*;

public class FindFirstUnique {
    public static void main(String[] args) {
     int[] arr = {6,2,3,3,3,4,5,6,7,8,9,8,8,5,4,2,1};
        int firstUnique = firstUnique(arr);
        System.out.println(firstUnique);
    //
   }

    public static int firstUnique(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int number = map.getOrDefault(arr[i],0);
            map.put(arr[i],number +1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == 1)
                return arr[i];
        }
        return -1;
    }
}
