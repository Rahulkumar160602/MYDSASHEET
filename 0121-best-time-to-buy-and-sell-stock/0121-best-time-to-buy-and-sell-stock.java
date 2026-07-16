class Solution {
    public int maxProfit(int[] p) {
        int max=0;
        int min=p[0];
        int i=1;
        while(i<p.length){
            min=Math.min(min,p[i]);
            max=Math.max(max,p[i]-min);
            i++;
        }
        return max;
    }
}