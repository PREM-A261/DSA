package DAY5;

import java.util.ArrayList;

public class day5 {

    // public static int sum(int n) {
    //     if(n == 0){
    //         return 0;
    //     }
    //     return n+ sum(n-1);
    // }
    // public static void main(String[] args) {
    //     int n= 10;
    //     System.out.println(sum(n));

    // }


    //     public static int fact( int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     return n* fact(n-1);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int r=  3;
    //     int numerator = fact(n);
    //     int denomenator = fact(n-r);
    //     System.out.println(numerator/denomenator);
    // }


    // public static int fact( int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     return n* fact(n-1);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int r=  3;
    //     int numerator = fact(n);
    //     int denomenator = fact(n-r);
    //     int R = fact(r);
    //     System.out.println(numerator/(denomenator)*R);
    // }


    //Quike sort 
//     public static ArrayList<Integer> quickSort(ArrayList<Integer> arrList) {
//         if (arrList.size() <= 1) {
//             return arrList;
//         }
//         int pivot = arrList.get(0);
//         ArrayList<Integer> small = new ArrayList<>();
//         ArrayList<Integer> big = new ArrayList<>();
//         for (int i = 1; i < arrList.size(); i++) {
//             if (arrList.get(i) > pivot) {
//                 big.add(arrList.get(i)); 
//             }else {
//                 small.add(arrList.get(i));
//             }
//         }
//         ArrayList<Integer> result = new ArrayList<>();
//         result.addAll(quickSort(small));
//         result.add(pivot);
//         result.addAll(quickSort(big));
//         return result;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> arrList = new ArrayList(Arrays.asList(36, 98, 1, 11, 12, 67, 45, 6, 6));
//         System.out.println(quickSort(arrList));
//     }



    public static int countMaze(int i, int j, int n, int m) {

        if (i == n || j == m)
            return 0;

        if (i == n - 1 && j == m - 1)
            return 1;

        // Move Down
        int downPath = countMaze(i + 1, j, n, m);

        // Move Right
        int rightPath = countMaze(i, j + 1, n, m);

        return downPath + rightPath;

    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int res = countMaze(0, 0, n, m);
        System.out.println("Total Paths = " + res);

    }
}
