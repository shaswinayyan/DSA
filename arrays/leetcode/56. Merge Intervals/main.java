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

        for (int i = 0; i < intervals.length; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (resultList.isEmpty() || intervals[i][0] > resultList.get(resultList.size() - 1).get(1)) {
                resultList.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                resultList.get(resultList.size() - 1).set(1,
                                            Math.max(resultList.get(resultList.size() - 1).get(1), intervals[i][1]));
            }
        }
        
        System.out.println(resultList);

    }
}
