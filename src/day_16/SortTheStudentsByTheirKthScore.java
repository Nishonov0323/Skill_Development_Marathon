package src.day_16;

public class SortTheStudentsByTheirKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;

        for (int i = 0; i < m; i ++) {
            for (int j = 1; j <= m - 1; j ++) {
                if (score[j - 1][k] < score[j][k]) {
                    for (int row = 0; row < n; row ++) {
                        int temp = score[j][row];
                        score[j][row] = score[j - 1][row];
                        score[j - 1][row] = temp;
                    }

                }
            }
        }
        return score;
    }
    public static void main(String[] args) {
        int[][] nums = {{3,4},{5,6}};
        int[][] res = new SortTheStudentsByTheirKthScore().sortTheStudents(nums, 0);

        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
