package DAY5;

public class CountMaze {
    
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
