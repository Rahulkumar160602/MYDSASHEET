class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void backtrack(int i,int []c,int t,List<Integer>ds){
        if(t==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<c.length;j++){
            if(j>i && c[j]==c[j-1]){
                continue;
            }
            if(c[j]>t){
                break;
            }
            ds.add(c[j]);
            backtrack(j+1,c,t-c[j],ds);
            ds.remove(ds.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        backtrack(0,c,t,new ArrayList<>());
        return res;
        
    }
}