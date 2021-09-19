package ZohoInterviewProblems;

class NonOverlappingSUbarray {
	
	public static void main(String[] args) {
		int arr[] = {0,6,5,2,2,5,1,9,4};
		int f=1,s=2,result;
		result = maxSumTwoNoOverlap(arr,f,s);
		System.out.println(result);
	}
    static Integer[][] memo;
    public static int maxSumTwoNoOverlap(int[] arr, int f, int s) {
        
        int n=arr.length;
        
        memo=new Integer[n+1][n+1];
        
        for(int i=1;i<n;i++)
        arr[i]+=arr[i-1];
        
        int answ=0;
        
        for(int i=0;i<=n-f;i++)
        {
            int res=Math.max(f(arr,0,i,s),f(arr,i+f,n,s));
            
            int x;
            if(i==0)
            x=arr[i+f-1];
            else
            x=(arr[i+f-1]-arr[i-1]);
            
            answ=Math.max(answ,res+x);
        }
        
        return answ;
        
    }
    
    static int f(int[] arr,int i,int n,int m)
    {
        if(n-i<m)
        return 0;
        
        if(memo[i][n]!=null)
        return memo[i][n];
        
        int res=0;
        if(i==0)
        res=arr[i+m-1];
        else
        res=arr[i+m-1]-arr[i-1];
        
        int x=f(arr,i+1,n,m);
        
        return memo[i][n]=Math.max(x,res);
        
    }
    
}