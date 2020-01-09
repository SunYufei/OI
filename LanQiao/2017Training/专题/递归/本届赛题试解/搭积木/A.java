
public class A
{
	static int N;
	
	static void show(int[] a)
	{
		System.out.println("   " + a[0]);
		System.out.println("  " + a[1] + " " + a[2]);
		System.out.println(" " + a[3] + " " + a[4] + " " + a[5]);
		System.out.println("" + a[6] + " " + a[7] + " " + a[8] + " " + a[9]);
		System.out.println();
	}
	
	static boolean near(int a, int b)
	{
		if(a+1==b || a==b+1) return true;
		return false;
	}
	
	static void test(int[] a)
	{
	 	if(a[1]<a[0]) return;
	 	if(a[2]<a[0]) return;
	 	if(a[3]<a[1]) return;
	 	if(a[4]<a[1]) return;
	 	if(a[4]<a[2]) return;
	 	if(a[5]<a[2]) return;
	 	if(a[6]<a[3]) return;
	 	if(a[7]<a[3]) return;
	 	if(a[7]<a[4]) return;
	 	if(a[8]<a[4]) return;
	 	if(a[8]<a[5]) return;
	 	if(a[9]<a[5]) return;
	 	
	 	show(a);
	 	N++;
	}
	
	static void f(int[] a, int k)
	{
		if(k==a.length-1){
			test(a);
			return;
		}
		
		for(int i=k; i<a.length; i++){
			{int t=a[i]; a[i]=a[k]; a[k]=t;}
			f(a,k+1);
			{int t=a[i]; a[i]=a[k]; a[k]=t;}
		}
	}
	
	public static void main(String[] args)
	{
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		f(a,0);
		
		System.out.println("N= " + N);
	}
}