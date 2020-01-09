
/*
  阶乘的位数，大整数问题
*/

import java.math.BigInteger;

public class A
{
	static int J(int x)
	{
		int p = 1;
		for(int i=2; i<=x; i++){
			p *= i;
		}
		return p;
	}
	
	static BigInteger JJ(int x)
	{
		BigInteger p = BigInteger.ONE;
		for(int i=2; i<=x; i++){
			p = p.multiply(BigInteger.valueOf(i));
		}
		return p;
	}
	
	public static void main(String[] args)
	{
		BigInteger x = JJ(9999);
		System.out.println(x);
		
		String m = x.toString(2);
		System.out.println(m);
		System.out.println("位数=" + m.length());
	}
}