import java.util.Scanner;

public class IChainOfOnes {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];

        for(int i=0; i<n; ++i){
            a[i]=in.nextInt();
        }
        int cnt=0;
        int max= 0, max2=0;
        for(int i=0; i<n; ++i){
            if(a[i] == 0 && i!=n-1) {
                max2=Math.max(max, max2);
                max = Math.max(max, cnt);
                cnt=0;
            }
            else if(a[i]!=0)
                cnt++;
            if(i==n-1 && (max2!=0 || max!=0)) {
                max2=Math.max(max, max2);
                max = Math.max(max, cnt) + max2;
            }
            else if (i==n-1 && a[i] !=0)
                max=cnt-1;
            else if (i==n-1 && a[i] ==0)
                max=cnt;

        }
        System.out.println(max);
    }
}
