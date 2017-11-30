import java.util.ArrayList;
import java.util.List;

public class PerfectNoWithPerformance {
	
public static void main(String[] args) {
		
		
		System.out.println("Finding perferct numbers between 2 numbers");
		List<Integer> perfectList =findPerfectNobetween(33550300,33550400);
		System.out.println("Perfect numbers are: " + perfectList);
	}
	
	
	public static List<Integer> findPerfectNobetween(int no1,int no2)
	{  List<Integer> perf =new ArrayList<>();
	   int sqr;
	   int d;
	  
		for(int i=no1 ; i<=no2; i++) {
			
			int sum=1;
			sqr=(int)Math.sqrt(i);
			for(int j=2; j<=sqr; j++) {
				
				if(i%j==0)
			    {
			        sum+=j;
			        d= i/j;
			        if(d!=j)
					{ sum+=d;
					}
			    }
	       }
			if(sum==i)
			{
				perf.add(i);}
       }
		return perf;
	}
}