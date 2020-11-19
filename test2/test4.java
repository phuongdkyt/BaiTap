package test2;

public class test4 extends Abc{
 private int c;

	public test4(int a,int b,int c) {
       super(a);
       this.c=c;
	}

	public static void main(String[] args) {
		
		test4 a=new test4(4, 5, 7);
		System.out.println(a.getA());
	}

}
