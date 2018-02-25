import java.util.ArrayList;

public class Time {
	static int m=200;
	static int n=13;
	public static void main(String[] args)
	{
		long start = System.nanoTime();
		Euclid(m,n);
		long end = System.nanoTime();
		System.out.println("Euclid Time: " + (end - start)/1000 + " microseconds");
		
		start = System.nanoTime();
		consecutive(m,n);
		end = System.nanoTime();
		System.out.println("Consecutive Time: " + (end - start)/1000 + " microseconds");
		
		start = System.nanoTime();
		middleschool(m,n);
		end = System.nanoTime();
		System.out.println("Middle School Time: " + (end - start)/1000 + " microseconds");
	}
	
	public static int Euclid(int m, int n) {
		if(n==0) {
//			System.out.println("Euclid: " + m);
			return m;
		}else {
			return Euclid(n, m%n);
		}
	}
	
	public static int consecutive(int m, int n){
		int temp = Math.min(m,n);
		while(temp>0) {
			if(m%temp!=0||n%temp!=0) {
				temp--;
			}else {
				break;
			}
		}
//		System.out.println("Consecutive: " + temp);
		return temp;
	}
	public static int middleschool(int m, int n) {
		if(m==0) {
			return n;
		}else if(n==0) {
			return m;
		}
		ArrayList<Integer> factors_m = primeFactors(m);
		ArrayList<Integer> factors_n = primeFactors(n);
		return compare(factors_m,factors_n);
	}
	
	public static int compare(ArrayList<Integer> m, ArrayList<Integer> n) {
		int result=1;
		
		for(int a = 0; a< m.size();a++) {
			for(int b = 0; b< n.size();b++) {
				if(m.get(a)==n.get(b)) {
					result *=m.get(a);
					n.set(b,-1);
					break;
				}
			}
		}
//		System.out.println("Middle School: " +result);
		return result;
	}
	
	public static ArrayList<Integer> primeFactors(int n)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		while (n%2==0)
		{
			factors.add(2);
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i+= 2)
		{
			while (n%i == 0)
			{
				factors.add(i);
				n /= i;
			}
		}
		if (n > 2) {
			factors.add(n);
		}
		return factors;
	}
}
