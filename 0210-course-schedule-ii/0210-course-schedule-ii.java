class Solution {
    public int[] findOrder(int nc, int[][] prerequisites) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<nc;i++)
            graph.add(new ArrayList<>());
        
        int []indegree=new int[nc];

        for(int []pre:prerequisites)
        {
            int fe=pre[0];
            int se=pre[1];
            graph.get(fe).add(se);
            indegree[se]++;
        }
        ArrayList<Integer>topologicalOrder = new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }

        while(q.size()>0)
        {
            int fnt=q.remove();
            topologicalOrder.add(fnt);
            for(int nbr:graph.get(fnt))
            {
                indegree[nbr]--;
                if(indegree[nbr]==0)
                    q.add(nbr);
            }
        }
        
        if(topologicalOrder.size()!=nc)
        {
            int []ans=new int[0];
            return ans;
        }
        int []mans=new int[nc];
        int idx=0;
        for(int i=topologicalOrder.size()-1;i>=0;i--)
        {
            mans[idx++]=topologicalOrder.get(i);
        }
        return mans;
    }
}