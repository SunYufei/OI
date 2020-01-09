
/*
 找不到相似性？  是否应增加参数
 
 回溯？ 面向状态，
 函数式编程 消失  scala clojure erlang ...
*/

public class B
{
	// 当前考虑第k位
	// n: 当前还剩余的名额
	// s: 当前取号的
	static void f(int[] data, int k, int n, String s)
	{
		if(n<0) return;
		
		if(n==0){
			System.out.println(s);	
			return;
		}
		if(k==data.length) return;
		
		for(int i=0; i<=data[k]; i++){
			String s2 = s;
			for(int j=0; j<i; j++)  s2 += (char)('A'+ k);
			f(data, k+1, n-i, s2);
		}
	}
	
	public static void main(String[] args)
	{
		// A 2  B 3 C 1 D 5
		int[] data = {2,3,1,5};
		
		f(data, 0, 4, "");
	}
}