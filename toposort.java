class Solution
{
    //Function to return list containing vertices in Topological order.
   static void dfs(int v, ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,boolean[] vis){
        vis[v] = true;
        for(int i:adj.get(v)){
            if(!vis[i]){
                dfs(i,adj,st,vis);
            }
        }
        st.push(v);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V];
        int[] ans = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                dfs(i,adj,st,vis);
            }
        }
        int k = 0;
        while(!st.empty()){
            ans[k++] = st.pop();
        }
        return ans;
    }
}
