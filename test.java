//to print fibonacci series using recursion
class Test {
	static int a=0,b=1,c=0;
	static void printFibonacci(int terms) {
		if(terms>0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" "+c);
			printFibonacci(terms-1);
		}
	}
	public static void main(String[] args) {
		int terms=10;
		System.out.print(a+" "+b);
		printFibonacci(terms-2);
		
	}
}



//to print fibonacci series without recursion
class Test {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		System.out.print(a+ " " +b);
		for(int i=1; i<=10; i++) {
			c = a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
