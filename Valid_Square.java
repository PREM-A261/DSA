import java.util.Arrays;

public class Valid_Square {
    public int distance(int a[], int b[]){
        int x = b[0]-a[0];
        int y = b[1]-a[1];
        int s = (x*x) + (y*y);
        return s;

    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int d[] = new int[6];
        d[0] = distance(p1,p2);
        d[1] = distance(p2,p3); 
        d[2] = distance(p3,p4);
        d[3] = distance(p4,p1);
        d[4] = distance(p1,p3);
        d[5] = distance(p2,p4);
        Arrays.sort(d);
        return d[0]>0&&d[0]==d[1]&&d[1]==d[2]&&d[2]==d[3]&&d[4]==d[5];
        
    }
    public static void main(String[] args) {
        Valid_Square vs = new Valid_Square();
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        boolean result = vs.validSquare(p1, p2, p3, p4);
        System.out.println("Is valid square: " + result);
    }
}
