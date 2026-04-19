package Day1;
import java.util.ArrayList;

public class RemoveDuplicates_fromArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arrList = new ArrayList<>();
        int arr[] ={1,4,1,4,2,6,7,9,1};
        for(int val:arr){
            arrList.add(val);
        }
        for(int i=0;i<arrList.size();i++){
            for(int j=i+1;j<arrList.size();j++){
                if((arrList.get(i)).equals(arrList.get(j))){
                    arrList.remove(j);
                    j--;
                }
            }
        }
        for(int i=0;i<arrList.size();i++){
            System.out.print(arrList.get(i) + " ");
        }
    }
}
