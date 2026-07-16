class Solution {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
    public long gcdSum(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(nums[i],nums[j]);
            i++;
            j--;
        }
        return (long)sum;
    }
}