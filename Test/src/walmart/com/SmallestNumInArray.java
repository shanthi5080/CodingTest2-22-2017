package walmart.com;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

//Find the smallest number from a given array int[] arr ={-2,5,6,7,8}
public class SmallestNumInArray {
	
	public static void findSmallest(){
		
		int[] array1= {10,5,6,7,8};
		
		int smallest =array1[0];
		
		for (int i=0;i<array1.length;i++){
			 if (array1[i]<smallest)
				smallest=  array1[i];
		//System.out.println( "smallest number is "+ smallest);
					 
			//min=array1[1];
			
		}
		
		 
		System.out.println( "smallest number is "+ smallest);
	}
	public static void main(String[] args) {
		
		SmallestNumInArray.findSmallest();
		
	}

}
