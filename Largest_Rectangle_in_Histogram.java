import java.util.Stack;
class Largest_Rectangle_in_Histogram {
    public int largestRectangleArea(int[] arr) {
        int maxArea =0;
        int []nsr = new int[arr.length];
        int []nsl = new int[arr.length];

        Stack<Integer> s= new Stack<>();

        //next smallest right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smallest left
        s.clear();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //area calculator 
        for(int i=0;i<arr.length;i++){
            int currArea = arr[i] * (nsr[i]-nsl[i]-1);
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Largest_Rectangle_in_Histogram s = new Largest_Rectangle_in_Histogram();
        int []arr = {2,1,5,6,2,3};
        System.out.println(s.largestRectangleArea(arr));
    }
}