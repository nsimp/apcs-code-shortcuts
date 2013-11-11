/**
*
* @author Noah Simpson
*
* This file contains various algorithms and functions
* that perform commonly used operations on arrays.
* Useful for those annoying arrays labs that we're constantly
* assinged in APCS class.
*
*/


/**
*
* Take scanner input from a user and store it in an array
* change the data type for something other than integers
* Required imports: java.util.Scanner
*/

public static void makeInputArray(Scanner s) { 
	System.out.print("How many elements should the array hold :: ");
	int un = s.nextInt();
	
	int[] ele = new int[un];
	for(int i=0; i<un; i++) {
		System.out.print("Element "+(i+1)+" out of "+un+" :: ");
		ele[i] = s.nextInt();
	}
}

/**
*
* Operate on all elements in an array for given condition
*/

public static void operateOnElements(int[] arr) {
	// for all the elements in array arr
	for(int i : arr) {
		if(condition) {

		}
	}
}

/**
*
* Get all of the even or odd elements in an array
* depending on the argument boolean "odd"
*/

// count the number of even or odd elements in an array
public static int countBasedOnCondition(int[] arr, boolean oddElements) {
	 int c = 0;
	 for(int i : arr) {
	 	if(oddElements ? i % 2 == 0 : i % 2 == 1) {
	 		c++;
	 	}
	 }

	 return c;
}

// assign all even elements to an array
public static int[] getEvenElements(int[] arr) {
	int res_size = countBasedOnCondition(arr, false);
	int[] res = new int[res_size];
	int pos = 0;

	for(int i : arr) {
		if(i % 2 == 0) {
			res[pos++] = i;
		}
	}

	return res;
}

// assign all odd elements to an array
public static int[] getOddElements(int[] arr) {
	int res_size = countBasedOnCondition(arr, true);
	int[] res = new int[res_size];
	int pos = 0;

	for(int i : arr) {
		if(i % 2 == 1) {
			res[pos++] = i;
		}
	}

	return res;
}

/**
*
* Add values in an array from one index to another
*/

public static int addDefinedIndexes(int[] arr, int startIndex, int endIndex) {
	int sum = 0;

	if(startIndex > endIndex) {
		int t = 0;
		t = startIndex;
		startIndex = endIndex;
		endIndex = t;
	}

	for(int i = startIndex; i <= endIndex; i++) {
		sum += arr[i];
	}

	return sum;
}

/**
*
* Return the number of times a value is present in an array
*/

public static int getNumberOfDefinedElement(int[] arr, int value) {
	int count = 0;

	for(int i : arr) {
		if(i == val) {
			count++;
		}
	}

	return count;
}

/**
*
* Remove a value from an array
* Requires getNumberOfDefinedElements
*/

public static int[] removeValueAndReturnNewArray(int[] arr, int value) {
	int res_size = arr.length - getNumberOfDefinedElement(arr, value);
	int[] res = new int[res_size];
	int pos = 0;

	for(int i : arr) {
		if(i != value) {
			res[pos++] = i;
		}
	}

	return res;
}

/**
*
* Return all values bigger than a defined value
*/

// todo