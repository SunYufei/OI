

public class A
{
	// 随机模拟一次 0：表示不碰撞
	static int test()
	{
		int n = 100;
		int[] day = new int[365];
		for(int i=0; i<n; i++){
			int k = (int)(Math.random() * 365);
			if(day[k]>0) return 1;
			day[k] = 1;
		}
		return 0;		
	}	

	
	public static void main(String[] args)
	{
		int n = 1000 * 100;  // 模拟次数
		int N = 0;  // 出现相同的次数
		for(int i=0; i<n; i++){
			N += test();
		}
		
		System.out.println(100.0 * N / n);
	}
}