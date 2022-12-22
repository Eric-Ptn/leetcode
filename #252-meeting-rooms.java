/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

 class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {

        sort(intervals);
       
        for(int i = 0; i < intervals.size() - 1; i++){
            if(intervals.get(i).end > intervals.get(i+1).start){
                return false;
            }
        }

        return true;
       
    }
    void sort(List<Interval> intervals){
        int n = intervals.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (intervals.get(j).start > intervals.get(j+1).start) {
                    // swap arr[j+1] and arr[j]
                    Interval temp = intervals.get(j);
                    intervals.set(j, intervals.get(j + 1));
                    intervals.set(j + 1, temp);
                }
    }
}