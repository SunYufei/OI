
// 没有循环的语言 haskell    <cheat sheet>

// 循环改递归
// 思想：踢皮球  把主要逻辑推给"别人"

// 1. 相似性
// 2。出口
// 3. 栈够用？
public class A
{
	static void f(int n)
	{
		if(n>0)	f(n-1);
		System.out.println(n);
	}
	
	static String g(String s)
	{
		if(s.length()<=1) return s;
		
		return g(s.substring(1)) + s.charAt(0);
		
		/*
		String s2 = "";
		for(int i=0; i<s.length(); i++) s2 = s.charAt(i) + s2;
		
		return s2;
		*/
	}
	
	// 振兴中华
	static int zh(int x, int y)
	{
		if(x==0 || y==0) return 1;
		return zh(x-1,y)+zh(x,y-1);
	}
	
	public static void main(String[] args)
	{
		System.out.println(zh(4,3));
		
		//System.out.println(g("abcdefg"));
		
		//f(9);
		//for(int i=0;i<10; i++){
		//	System.out.println(i);
		//}
	}
}