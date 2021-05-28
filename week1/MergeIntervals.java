//Time complexity O(NlogN), Space:O(N)
import java.util.*;
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> li=new ArrayList<int[]>();
        for (int[] interval:intervals){
            if(li.size()==0||li.get(li.size()-1)[1]<interval[0]){
                li.add(interval);
            }else{

                if(interval[1]>li.get(li.size()-1)[1]) {
                    int[] ar={li.get(li.size()-1)[0],interval[1]};
                    li.set(li.size() - 1, ar);
                }
                }
            }
        int[][] res=new int[li.size()][2];
        int i=0;
        for(int[] el:li){
            res[i]=el;
            i++;
        }
        return res;
    }
    public static void main(String[] args){
        MergeIntervals obj=new MergeIntervals();
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] out=obj.merge(intervals);

    }
}
