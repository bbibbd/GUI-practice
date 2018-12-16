package ConstrucctorOverloadOverride;



public class Test {
	
	int n=0;
	double m=0;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}


	
	public Test(int n) {
		this.n= n;
	}
	
	public Test(double m) {
		this.m = m;
	}
	
	public Test(int n, double m) {
		this.n=n;
		this.m=m;
	}
	
	public void printN(int n) {
		System.out.println(n);
	}
	
	public void printN(double n) {
		System.out.println(n);
	}
	
	public void printN(String n) {
		System.out.println(n);
	}
	
	
	public static void main(String [ ] args) {
		Test integer = new Test(10);
		Test dou = new Test(10.14);
		Test intdou = new Test(10, 10.14);
		String str = "lowercase";
		
		System.out.println("Integer type");
		System.out.println(integer.getN());
		System.out.println(integer.getM());
		
		System.out.println("\nDouble type");
		System.out.println(dou.getN());
		System.out.println(dou.getM());
		
		System.out.println("\nIntandDou Type");
		System.out.println(intdou.getN());
		System.out.println(intdou.getM()+"\n");
		
		System.out.println(	str.toUpperCase());
		System.out.println(	str.replace('l', 'L'));
	
	
	}
	
	
}