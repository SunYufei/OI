

/*
  看到其本质是亦或关系
  1
 0 1
 
  1
 1 0
 
  0
 1 1
 
  0
 0 0
*/

import java.util.*;

public class A
{	
	// 快速计算一个数字的二进制表示中有过少个1
	static int nbit(int n)
	{
		n=(n & 0x55555555)+((n>>1) & 0x55555555);
		n=(n & 0x33333333)+((n>>2) & 0x33333333);
		n=(n & 0x0F0F0F0F)+((n>>4) & 0x0F0F0F0F);
		n=(n & 0x00FF00FF)+((n>>8) & 0x00FF00FF);
		n=(n & 0x0000FFFF)+((n>>16) & 0x0000FFFF);
		return n;
	}
	
	// 底行n个人，整个塔共有m个1，返回多少种
	static int f(int n, int m)
	{
		int N = 0;
		int sh = 32-n;  // 初始左空位
		int a0 = 0;
		
		while(a0<1<<n){
			int a = a0;
			
			int sum = 0;  // 1 的个数
			for(int i=0; i<n; i++){
				a &= 0xffffffff >>> (sh+i);
				sum += nbit(a);
				a ^= a >> 1;
			}
			
			if(sum==m){ 
				N++;
				System.out.println(Integer.toString(a0,2));
			}
			
			a0++;
		}
		
		return N;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] ss = scan.nextLine().trim().split(" ");
		
		int a = Integer.parseInt(ss[0]);  //A类数目
		int b = Integer.parseInt(ss[1]);  //B类数目
		
		int 底行人数 = (int)(Math.sqrt((a+b)*2));
		
		int n = f(底行人数,b);
		
		//int n = f(2,2);
		
		System.out.println("N=" + n);
	}
}