/*
@author: adamzaidi

***THIS PROGRAM WILL NOT COMPILE***

This program attempts to declare a variable
in an inner scope with the same name as one defined in an outer scope.
*/

class NestVar {
	public static void main(String args[]) {
		int count; // (1)

		for (count = 0; count < 10; count = count + 1) {
			System.out.println("This is count: " + count);

			int count; // illegal!!!!!!!! -> can't declare count again because it's already been declared (1)
			for(count = 0; count < 2; count++)
				System.out.println("This program is in error!");
		}
	}
}

/*

This is the error shown in the console:
NestVar.java:17: error: variable count is already defined in method main(String[])

*/