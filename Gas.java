import java.util.Scanner;
public class Gas
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt(),c=0;
	    int[] gas = new int[n];
	    int[] cost= new int[n];
	    int sum1=0,sum2=0;
	    for(int i=0;i<gas.length;i++)
	    {
	        gas[i]=s.nextInt();
	        sum1+=gas[i];
	    }
	   
	    for(int j=0;j<cost.length;j++)
	    {
	        cost[j]=s.nextInt();
	        sum2+=cost[j];
	    }
		if(sum1==sum2)
	    {
            int m=0,n1=0;
	        for(int i=0;i<gas.length;i++)
	        {
                
                for(int j=i;j<=i;j++)
                {
                    n1+=gas[i]-cost[j];
	                m+=gas[i]-cost[j];
	                if(n1<0)
	                {
	                    c=i+1;
						n1=0;
                    }
	            }
	        }
			if(m>=0){
	        System.out.println(c);
			}
	    }
	    else{
	        System.out.println("-1");
	    }
	}
}
