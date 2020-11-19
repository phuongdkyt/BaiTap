package test2;

public class test3 {

 public static double maximum(double a,double b,double c) {
//	double temp=Math.max(a, b);
//	return Math.max(temp, c);
if(a>b&&a>c)
	return a;
else if(b>a&&b>c)
	return b;
else if(c>a&&c>b)
	return c;
return c;


 }
 public void ha() {
//	 Abc.amethod();
 }
 public static int giaiThua(int n) {
	
	if(n==0||n==1)
		return 1;
	return giaiThua(n-1)*n;
	
	 
 } 

 public static int Fibonacci(int n) {
	 if(n==0) return 0;
	 if(n==1) return 1;
	return Fibonacci(n-1)+Fibonacci(n-2);	 
 }
	public static void main(String[] args) {
     int[] response= {1,2,5,4,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,1};
//     int r[]=new int[5];
//     for(int i=0;i<=response.length;i++) {
//		if(response[i]==1)
//    		r[0]++;
//    	if(response[i]==2)
//    		r[1]++;
//    	if(response[i]==3)
//    		r[2]++;
//    	if(response[i]==4)
//    		r[3]++;
//    	if(response[i]==5)
//    		r[4]++;
//     }
// for(int i=1;i<=5;i++) {
//	 System.out.printf("\n%d -> %d",i, r[i-1]);
// }
int t1=0,t2=0,t3=0,t4=0,t5=0;    		 
for(int i:response)	{
	if(i==1)
		t1++;
	if(i==2)
		t2+=1;
	if(i==3)
		t3+=1;
	if(i==4)
		t4+=1;
	if(i==5)
		t5+=1;
}
 System.out.println("1 -> "+t1);  	
 System.out.println("2 -> "+t2);  		
 System.out.println("3 -> "+t3);  		
 System.out.println("4 -> "+t4);  		
 System.out.println("5 -> "+t5);  		
	}

;

}
