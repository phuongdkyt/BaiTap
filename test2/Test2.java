package test2;

import java.util.Arrays;
import java.util.Collections;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Test2 {

	public static void main(String[] args) {
//		int [][] array1= {{1,2,3},{4,5,6}};
//		int [][] array2= {{1,2},{3},{4,5,6}};
//		System.out.println("Value Array 1: ");
//         outputtArray(array1);
// 		System.out.println("\nValue Array 2: ");
//        sumArray(array2); 
//        System.out.printf("\nd1= %f\n",average(10,20));
//        System.out.printf("\nd2= %f\n",average(10,20,30));
//        System.out.printf("\nd3= %f\n",average());
//        int a[]= {4,7,1,8,2,3};
//        Arrays.sort(a);
//        for(int i:a)
//        	System.out.print(i);
//        Collections.reverse(Arrays.asList(a));
//        for(int i:a)
//        	System.out.println(i);
		int c=0;
		int d=0;
		while(c++<5){
			System.out.println("cc-"+c);
		   	if(c++>3&&d++>2) {
		   		System.out.println("c-"+c);
		   		System.out.println("d-"+d);
		   		d++;
		   	}
				
		}
	
	}

	public static void sumArray(int [][] array) {
		int sum=0;
//		for(int row=0;row<array.length;row++) {
//			for(int col=0;col<array[row].length;col++)
//				sum+=array[row][col];
//					
//		}
		for(int[] i:array)
			for(int j:i)
				sum+=j;
		System.out.println("sum="+sum);
	}
public static void outputtArray(int [][] array) {
	for(int row=0;row<array.length;row++) {
		for(int col=0;col<array[row].length;col++)
			System.out.printf("\t%d",array[row][col]);
		System.out.println();
	}

}
public static double average(double...number) {
	double total=0.0;
	for(double i:number) 
		total+=i;
	return total;
}

public Test2() {
	
}
public Test2(int i) {
	
}
public Test2(int i,int j) {
	this(i);
	int a=5;
}
public Test2(int i,int j,int k) {
	int a=5;  
}
static class as{
	int a;
	public void ok() {
		System.out.println("ok");
	}
}
}
