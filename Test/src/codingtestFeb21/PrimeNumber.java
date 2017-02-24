package codingtestFeb21;

public class PrimeNumber {
	// int prime =0;
	boolean isPrime;

	public void  primeorNot(int n) {
		// 1 and 2 are prime numbers
		// 11/2 =5
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("the number is not prime number"+ n);
				
				//isPrime = false;
			} else {
				//isPrime = true;
				System.out.println("the number is not prime number"+ n);
				

			}
			//return  isPrime;
		}

	}
	
	public static void main(String[] args) {
		
		PrimeNumber pn =new PrimeNumber();
		pn.primeorNot(10);
		//System.out.println(" the number is ")
	}
}
