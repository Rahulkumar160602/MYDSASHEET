class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void backtrack(int i,int k,int t,List<Integer>ds){
        if(t==0 && ds.size()==k){
            res.add(new ArrayList<>(ds));
            return;
        }
        if(t<0 || ds.size()>k){
            return;
        }
        for(int j=i;j<=9;j++){
            ds.add(j);
            backtrack(j+1,k,t-j,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1,k,n,new ArrayList<>());
        return res;
        
    }
}