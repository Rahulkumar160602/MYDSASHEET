class Solution {
    int count=0;
    public void dfs(int[][]grid,int i,boolean []vis){
        vis[i]=true;
        for(int j=0;j<grid.length;j++){
            if(grid[i][j]==1 && !vis[j]){
                vis[j]=true;
                dfs(grid,j,vis);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        boolean []vis=new boolean[isConnected.length];
        int v=isConnected.length;
        int c=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
               c++;
               dfs(isConnected,i,vis);
            }
        }
    return c;
    }


}