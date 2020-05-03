class Solution {
    public static int[][] table = new int[202][202];
    public static int solution(int n) {
        int i, j;
        for( i=0; i<=n; ++i)
            table[0][i]=1;

        table[1][1] = 1;
        table[2][2] = 1;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <n; j++)
            {
                if (i == 1 || i == 2)
                    table[i][j] += table[i][j-1];
                else {
                    int sum = table[i][j-1];
                    if (i >= j)
                        sum += table[i-j][j-1];
                    table[i][j] = sum;
                }
            }
        }
        return table[n][n-1];
    }

    public static void main(String[] args) {
        System.out.println(solution(8));

    }
}
