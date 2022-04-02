/*
@author: adamzaidi

This program uses the Pythagorean theorum to find the length of the
hypotenuse given the lengths of the two opposing sides.



!!!Notice how sqrt() is called, it is preceded by the name of the class of which it is a member.
*/

class Hypot {
	public static void main(String args[]) {
		double x, y, z;

		x = 3;
		y = 4;

		z = Math.sqrt(x*x + y*y); // See initial statement.

		System.out.println("Hypotenuse is " + z);
	}
}

