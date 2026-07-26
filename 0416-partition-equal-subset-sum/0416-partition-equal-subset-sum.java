class Solution {
    public boolean solve(int i,int t,int []nums,Boolean [][]dp){
        if(t==0){
            return true;
        }
        if(i==0){
           return t==nums[i];
        }
        if(dp[i][t]!=null){
            return dp[i][t];
        }
        boolean take=false;
        if(nums[i]<=t){
         take=solve(i-1,t-nums[i],nums,dp);
        }
        boolean not_take=solve(i-1,t,nums,dp);
        return dp[i][t]=take||not_take;
        
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int t=sum/2;
        if(sum%2!=0){
            return false;
        }else{
             Boolean [][]dp=new Boolean[nums.length][t+1];
             return solve(nums.length-1,t,nums,dp);
        }
        
    }
}