package DAY2;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        int arr[] = {1,4,1,4,2,1,7,9,1};
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(map.containsKey(String.valueOf(arr[i]))){
                map.put(String.valueOf(arr[i]), map.get(String.valueOf(arr[i]))+1);
            }
            else{
                map.put(String.valueOf(arr[i]), 1);
            }
        }
        
        for(String key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }

    }
}
