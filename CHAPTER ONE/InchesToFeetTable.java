/*
@author: adamzaidi
*/

class InchesToFeetTable {
	public static void main(String args[]) {
		int inches, feet;
		int counter;

		counter = 0;
		for(inches = 1; inches <= 144; inches++) {
			feet = inches / 12; // inches to feet
			System.out.println(inches + " inches is " + feet + 
				" feet.");

			counter++;
			// every 10th line, print a blank line
			if(counter == 10) {
				System.out.println();
				counter = 0; // reset the line counter
			}
		}
	}
}