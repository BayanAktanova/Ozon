import java.util.Arrays;
import java.util.Scanner;

public class XVIISearchNotSortedSubarray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        int[] nums2=new int[n];

        for(int i=0; i<n;i++)
        {
            int num=in.nextInt();
            nums[i]=num;
            nums2[i]=num;

        }

        if(nums.length == 0) {
            System.out.println(0);
        }

        Arrays.sort(nums);

        int left=0;
        int right=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=nums2[i]){
                left=i;
                break;
            }

        }

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]!=nums2[i]){
                right=i;
                break;
            }

        }

        System.out.println(left+ " "+right);
    }


}
