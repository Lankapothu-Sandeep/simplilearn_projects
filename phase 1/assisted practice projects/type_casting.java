package type_casting;

public class type_casting {

	public static void main(String[] args) {
		//implicit Conversion
		System.out.println("implicit conversion");
		byte a=126;
		short b= a;
		char c=(char) b;
		int d= c;
		long e= d;
		float f= e;
		double g= f;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("Value of c:"+c);
		System.out.println("Value of d:"+d);
		System.out.println("Value of e:"+e);
		System.out.println("Value of f:"+f);
		System.out.println("Value of g:"+g);
		
		//Explicit conversion
		System.out.println("explicit convertion");
		double h=75.6;
		float i=(float)h;
		long j=(long)i;
		int k=(int)j;
		char l=(char)k;
		short m=(short)l;
		byte n=(byte)m;
		System.out.println("Value of h:"+h);
		System.out.println("Value of i:"+i);
		System.out.println("Value of j:"+j);
		System.out.println("Value of k:"+k);
		System.out.println("Value of l:"+l);
		System.out.println("Value of m:"+m);
		System.out.println("Value of n:"+n);

		
	}

}
