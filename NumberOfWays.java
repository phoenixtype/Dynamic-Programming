import java.util.Arrays;

//https://leetcode.com/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps/
public class NumberOfWays {

    public static void main(String[] args) {
        NumberOfWays numberOfWays = new NumberOfWays();
        int val = numberOfWays.numberOfWays(1,2,3);
        System.out.println(val);
    }
    public int numberOfWays(int startPos, int endPos, int k) {
        //Creating a DP array
        int[][] dp = new int[3000][k+1];
        //Fill the DP array with -1
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(startPos, endPos, k, dp);
    }

    private int helper(int startPos, int endPos, int k, int[][] dp) {
        //if startPos and endPos are equal and the number of remaining steps are 0 then we have an answer so return 1
        if (startPos == endPos && k==0) {
            return 1;
        }

        //if startPos and endPos are not equal but the number of remaining steps are 0 then we do not have an answer so return 0
        if (k==0){
            return 0;
        }

        //if we have already calculated, so directly returning
        //Memoization
        if (dp[startPos+1000][k] != -1) {
            return dp[startPos+1000][k];
        }

        //Moving one step left
        int left = helper(startPos-1, endPos, k-1, dp);
        //Moving one step right
        int right = helper(startPos+1, endPos, k-1, dp);
        //Storing the answer in DP
        dp[startPos+1000][k] = (left+right)%((int)1e9+7);
        return dp[startPos+1000][k];
    }
}
