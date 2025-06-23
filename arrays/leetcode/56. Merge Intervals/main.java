import java.util.*;

public class main {
    public static void main(String[] args) {
        
        int[][] intervals ={{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]- b[0];
            }
        });
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!resultList.isEmpty() && end <= resultList.get(resultList.size()-1).get(1)){
                continue;
            }
            for(int j=i+1; j<intervals.length; j++){
                if(intervals[j][0]<= end){
                    end = Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            resultList.add(Arrays.asList(start,end));
        }
        
        System.out.println(resultList);

    }
}
