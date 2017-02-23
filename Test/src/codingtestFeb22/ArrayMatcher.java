package codingtestFeb22;

public class ArrayMatcher {
	
	
	public static int indexOfMatch(int[] a,int[] b){
		int index=-1;
		if(a.length<b.length){
			return index;
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==b[0]){
				index=i;
				
				for(int j=1;j<b.length;j++){
					if((i+j)>=a.length || a[i+j]!=b[j]){
						index=-1;
						break;
					}
				}//inner for loop
				if(index!=-1){
					return index;
				}
			}//if for loop
			
		}//outer for loop
		
		return index;
	}

	public static void main(String[] args) {
		System.out.println("index of match is "+indexOfMatch(new int[]{3,4,5,6,1},new int[]{5,6}));

	}

}
