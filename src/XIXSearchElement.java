import java.util.Scanner;

public class XIXSearchElement {

    public static boolean isInclude(int[] a, int[] b) {
        if (b == null) return true;

        int pos=BinarySaearch(a, b[0]);

        if (pos!=-1)
        {
            for (int i = 0; i < b.length - 1; ++i) {
                if (b[i] != a[pos])
                    return false;
                pos++;
            }
        }
        else
            return false;

        return true;
    }


    public static int BinarySaearch(int[] a, int key) {
        int l=0, r=a.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]>key)
                r=mid-1;
            else if(a[mid]<key)
                l=mid+1;
            else
                return mid;

        }
        return -1;
    }



    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();

        int[] a=new int[n];
        int[] b=new int[m];

        for(int i=0; i<n; i++)
        {
            a[i]=in.nextInt();
        }

        for(int i=0; i<m; i++)
        {
            b[i]=in.nextInt();
        }

        boolean res=isInclude(a,b);

        System.out.println(res);

    }
}
