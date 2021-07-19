import java.util.*;

public class IIParkingLot {
    private static class Interval implements Comparable<Interval> {
        int from, to;
        public Interval(int from, int to) {
            this.from = from;
            this.to = to;
        }
        @Override
        public int compareTo(Interval other) {
            return this.from - other.from;
        }
    }
    public static int CountCar(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return -1;

        List<Interval> intervalsList = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++)
            intervalsList.add(new Interval(intervals[i][0], intervals[i][1]));

        Collections.sort(intervalsList);

        Interval currentInterval = intervalsList.get(0);

        int cnt=1;
        //a.start <= b.end AND a.end >= b.start
        for (int i = 1; i < intervalsList.size(); i++) {
            if (currentInterval.from  <= intervalsList.get(i).to  && currentInterval.to >= intervalsList.get(i).from) {
                cnt++;
            }





        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        int[][] a= new int[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j]=in.nextInt();
            }
        }

        System.out.println(CountCar(a));

    }
}
