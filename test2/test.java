package test2;



public class test {
	public static int i=0;
	

	public test() {
	   i++;
	}
	public void ok() {
		i++;
	}


	public static void main(String[] args) {
//		test o = new test();
//	      int iBase=0;
//	      o.amethod(iBase);

//	  for(int i=20;i>=2;i-=2) {
//		  sum+=i;   
//	  }
//	    System.out.println(sum);
//		int i=2,sum=0;
//     do {
//    	 sum+=i;   
//    	 i+=2;
//     }while(i<=20);
//     System.out.println(sum); 
//     
//	}
//
//    public void amethod(int iOver){

//		for(int i=0;i<10;i++) {
//			if(i==5)
//				continue;
//			System.out.println(i);	
//		}
		
//		int i=0;
//		while(i<10) {
//			if(i==4)
//				continue;
//			System.out.println(i);
//			i++;
//		}
		System.out.println(cal(5));		
//		int i=1;
//		boolean b1 =false && ++i>10;
//		boolean b2 =true|| ++i>10;
//		System.out.println(i);
//		i=1;
//		boolean b3 =false & ++i>10;
//		boolean b4 =true| ++i>10;
//		System.out.println(i);
//		double a=Math.PI;
	    	
//        
       }
static //4
	int cal(int cat) {
		if(cat==1) return 4;
		if(cat%2==0)
			return cal(cat-1)+(3);
		else
			return cal(cat-1)+(4);
	//4+3+4+3+4
		
		
	}
}
