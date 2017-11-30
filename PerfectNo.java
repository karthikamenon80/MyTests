import java.util.ArrayList;
import java.util.List;

public class PerfectNo {

	public static void main(String[] args) {
		
		
		System.out.println("Finding perferct numbers between 2 numbers");
		List<Integer> perfectList =findPerfectNobetween(33550300,33550400);
		System.out.println("Perfect numbers are: " + perfectList);
	}
	
	
	public static List<Integer> findPerfectNobetween(int no1,int no2)
	{  int sum;
		
		List<Integer> perf =new ArrayList<>();
		for(int i=no1 ; i<=no2; i++) {
			sum=0;
			
			for(int j=1; j<=i/2; j++) {
				if(i%j  == 0)	{
					sum+= j;}
			}
			
		
		if (sum==i){
				perf.add(i);
				}
		
		}
		return perf;
	}
}
