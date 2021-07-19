import java.util.Scanner;

public class VIISubarrayMaxSum {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];

        for(int i=0; i<n;i++)
        {
            nums[i]=in.nextInt();
        }

        if(nums.length == 0) {
            System.out.println(0);
        }
        int[] from = new int[nums.length];
        int[] to = new int[nums.length];

        // 10 -3 -12 8 42 1 -7 0 3
        // curSum = 10, 7, -5, 8, 50, 51
        // {0, 0}, {0, 1}, {0, 2}, {3, 3}, {3, 4}, {3, 5}
        int[] curSum = new int[nums.length];
        curSum[0] = nums[0];
        from[0] = 0;
        to[0] = 0;


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > curSum[i - 1] + nums[i]) {
                curSum[i] = nums[i];
                from[i] = i;
                to[i] = i;
            }
            else {
                curSum[i] = nums[i] + curSum[i - 1];
                from[i] = from[i - 1];
                to[i] = i;
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int fromAns = -1;
        int toAns = -1;
        for (int i = 0; i < nums.length; i++) {
            if (curSum[i] > maxSum) {
                maxSum = curSum[i];
                fromAns = from[i];
                toAns = to[i];
            }
        }

        System.out.println(fromAns + " " + toAns);
    }
}
