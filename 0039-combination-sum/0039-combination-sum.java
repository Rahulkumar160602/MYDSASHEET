class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void backtrack(int i,int []c,int t,List<Integer>ds){
        if(i==c.length){
            if(t==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
            if(c[i]<=t){
                ds.add(c[i]);
                backtrack(i,c,t-c[i],ds);
                ds.remove(ds.size()-1);
            }
            backtrack(i+1,c,t,ds);

        }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        
        backtrack(0,c,t,new ArrayList<>());
        return res;
    }
}