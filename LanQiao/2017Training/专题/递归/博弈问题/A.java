
public class A
{
	static int[] cache = new int[10000];  // 把已经算过的存起来
	
	static boolean f(int n)
	{
		if(cache[n]>0){
			return cache[n]==1? true : false;
		}
		
		//if(n==0) return true;
		//if(n==1) return false;
		//if(n==2) return true;
		
		boolean tag = false;
		
		if(n>=1 && f(n-1)==false) tag = true;
		if(n>=3 && f(n-3)==false) tag = true;
		if(n>=7 && f(n-7)==false) tag = true;
		if(n>=8 && f(n-8)==false) tag = true;
		
		cache[n] = tag? 1 : 2;
		return tag;
	}
	
	public static void main(String[] args)
	{
		cache[0] = 2;
		cache[1] = 2;
		cache[2] = 1;
		
		System.out.println(f(80));
		System.out.println(f(5));
		System.out.println(f(6));
		System.out.println(f(10));
	}
}