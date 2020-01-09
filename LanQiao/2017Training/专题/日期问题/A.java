
/*
  求 a - b 差值
  d1 = a - base
  d2 = b - base
   
  d2-d1
  
  1968-10-1   --- 2014-5-3  day?
  22:13:15 --- 23:05:48   sec?
  
  delphi   3.1657    (int)(x * 100 + 0.5) / 100.0
*/

public class A
{
	static boolean leap(int year)
	{
		boolean tag = false;
		if(year % 4 == 0) tag = true;
		if(year % 100 == 0) tag = false;
		if(year % 400 == 0) tag = true;
		return tag;
	}
	
	// 距离 1000 年 1月1日 经过多少天 
	static int f(int year, int mon, int day)
	{
		int[] M = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(leap(year)) M[2]++;
		
		int sum = 0;
		for(int i=1000; i<year; i++){
			sum += 365;
			if(leap(i)) sum++;
		}
		
		for(int i=1; i<mon; i++){
			sum += M[i];
		}
		
		sum += day;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int d1 = f(1968,10,1);
		int d2 = f(2000,5,3);
		
		System.out.println(d2-d1);
	}
}