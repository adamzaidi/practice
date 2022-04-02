/*
@author: adamzaidi

This program finds all of the prime numbers 2 and 100.
*/

class PrimeNumberSearch {

	public static void main(String args[]) {

		int low = 2, high = 100;
		//initializes range of numbers
		while (low < high) {
			boolean flag = false;
			/*
			THIS FOR LOOP CHECKS ALL POSSIBLE FACTORS
			FOR PERFECT DIVISION, IF IT IS DIVISIBLE
			BY ANYTHING OTHER THAN ITSELF (BECAUSE THE PROGRAM SKIPS OVER 1
			& STOPS {@[VALUE]/2})
			THEN IT WILL RETURN TRUE.
			*/
			for (int i = 2; i <= low / 2; ++i) {
				// condition for nonprime number
				if (low % i == 0) {
					flag = true;
					break;
				}
			}
			/*
			IF FLAG IS FALSE & LOW IS NOT ZERO AND LOW IS NOT 1
			THEN SYSTEM PRINTS A PRIME NUMBER.
			*/
			if (!flag && low != 0 && low != 1)
				System.out.print(low + " ");

			//increment low
			low++;
		}
	}
}