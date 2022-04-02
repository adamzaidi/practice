/*
@author: adamzaidi
*/

class LtoD {
	public static void main(String args[]) {
		long L;
		double D;

		L = 100123285L;
		D = L; // automatic conversion from long to double

		System.out.println("L and D: " + L + " " + D);
	}
}