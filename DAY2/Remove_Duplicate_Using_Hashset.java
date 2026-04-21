package DAY2;
import java.util.*;
public class Remove_Duplicate_Using_Hashset {
    // public static void main(String[] args) {
    //     HashSet<Integer> set = new HashSet<>();
    //     int[] arr = {1, 2, 3, 4, 5, 2, 3, 4};
    //     boolean flag = false;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(!set.contains(arr[i])){
    //             set.add(arr[i]);
    //         }
    //         else{
    //             flag = true;
    //             break;
    //         }
    //     }
    //     System.out.println(flag);
    //  }



    // public static void main(String[] args) {
    //     HashSet<Integer> set = new HashSet<>();
    //     int[] arr = {1, 2, 3, 4, 5,1};
    //     for (int i = 0; i < arr.length; i++) {
    //         set.add(arr[i]);
    //     }
    //     if (arr.length != set.size()) {
    //         System.out.println("True");
    //     }

    //     else {
    //         System.out.println("False");
    //     }
    //  }



    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int[] arr = {1, 2, 1, 2, 4, 56, 78};
        // int[] arr = {1, 2, 4, 56, 78};

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                list.add(arr[i]);
                flag = true;
            }

            set.add(arr[i]);
        }
        
        System.out.println(flag);
        System.out.println("Duplicates "+ list);

    }
};

