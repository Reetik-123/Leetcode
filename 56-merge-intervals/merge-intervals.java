class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int newStart=intervals[i][0];
            int newEnd=intervals[i][1];
            if(currentEnd>=newStart){
                currentEnd=Math.max(currentEnd,newEnd);
            }else{
                list.add(new int[] {currentStart,currentEnd});
                currentStart=newStart;
                currentEnd=newEnd;
            }
        }
        list.add(new int[] {currentStart,currentEnd});
        return list.toArray(new int[list.size()][]);
    }
}