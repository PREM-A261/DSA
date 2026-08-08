public class Unique_Binary_Search_Trees {
    public int numTrees(int n) {
        int [] G = new int[n+1];
        G[0] = G[1] = 1;
            
        for(int i=2; i<=n; ++i) {
            for(int j=1; j<=i; ++j) {
            G[i] += G[j-1] * G[i-j];
            }
        }
        return G[n];
    }
    public static void main(String[] args) {
        Unique_Binary_Search_Trees obj = new Unique_Binary_Search_Trees();
        int n = 3;
        System.out.println("Number of unique BSTs with " + n + " nodes: " + obj.numTrees(n));
    }
}
