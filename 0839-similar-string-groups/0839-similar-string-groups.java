class Solution {
    int []par;
    int []rank;
    public boolean isSame(String s1,String s2)
    {
        int count=0;
        int l=Math.min(s1.length(),s2.length());
        for(int i=0;i<l;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2)
                count++;
        }
        if(count>2)
            return false;
        return true;
    }
    public int getPar(int x)
    {
        if(par[x]==x)
            return x;
        return par[x]=getPar(par[x]);
    }

    public void merge(int a,int b)
    {
        if(rank[a]>rank[b]){
            par[b]=a;
        }
        else if(rank[b]>rank[a]){
            par[a]=b;
        }
        else
        {
            rank[b]++;
            par[a]=b;
        }
    }
    public int numSimilarGroups(String[] strs) {
        int n=strs.length;
        par=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++)
        {
            par[i]=i;
            rank[i]=1;
        }
        int noOfGrp = n;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String s1=strs[i];
                String s2=strs[j];
                if(isSame(s1,s2))
                {
                    int p1=getPar(i);
                    int p2=getPar(j);
                    if(p1!=p2){
                        merge(p1,p2);
                        noOfGrp--;
                    }
                }
            }
        }
        return noOfGrp;
    }
}