// Java Week 04 Coding Project
// Letitia Pinter

package week04p;

import java.util.Random; // Necessary to generate random numbers because I felt like it.

public class Week04CodingProj {

	public static void main(String[] args) 
	{
		Random rand = new Random(); // Creates a random number generator.
		
		// 1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// 1. a.
		System.out.println(ages[(ages.length - 1)] - ages[0]); // Prints the value of the last element in the ages array minus the first element in the ages array.
		
		// 1. b.
		int[] ages2 = new int[9];
		
		// 1. b. i.
		for(int i = 0; i < ages2.length; i++)
		{ // Populates the ages2 array with random integers between 0 and 99.
			ages2[i] = rand.nextInt(100);
		}
		
		// 1. b. ii.
		System.out.println(ages2[(ages2.length - 1)] - ages2[0]); //Prints the value of the last element in the ages2 array minus the first element in the ages2 array.
		
		// 1. b. iii. Using these index values is dynamic because array.length - 1 will always get you the last element in the array, regardless of what the length of the array is.
		
		// 1. c.
		int sum = 0;
		for(int i = 0; i < ages2.length; i++)
		{
			sum += ages2 [i]; // Adds the ith element of ages to sum.
		}
		System.out.println((double)sum / (double)ages2.length); // Prints the sum of elements in the array divided by the number of elements in the array, in other words, the average value of array element. This also casts the values to double before performing the division, that way we get the correct average.
		
		// 2.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// 2. a.
		sum = 0; // Reusing sum variable.
		for(int i = 0; i < names.length; i++)
		{
			sum += names[i].length(); // Adds the length of the ith element of names to sum.
		}
		
		System.out.println((double)sum / (double)names.length); // Prints the sum of elements in the array divided by the number of elements in the array, in other words, the average value of array element. This also casts the values to double before performing the division, that way we get the correct average.
		
		// 2. b.
		StringBuilder allnames = new StringBuilder(); // Creates a StringBuilder to hold the result.
		for(int i = 0; i < names.length; i++)
		{
			allnames.append(names[i]); // Appends the next name to the StringBuilder.
			allnames.append(" "); // And then appends a space to it to separate the names with a space.
		}
		System.out.println(allnames.toString()); // Converts the StringBuilder to a String and then prints it.
		
		// 3. Use array[array.length - 1].
		
		// 4. array[0].
		
		// 5.
		int[] nameLengths = new int[names.length]; // Creates an int array with the same number of elements as the names array.
		for(int i = 0; i < names.length; i++)
			nameLengths[i] = names[i].length(); // Sets the ith element of nameLengths to be the length of the ith element of names.
		
		// 6.
		sum = 0; // Reusing the sum variable again.
		for(int i = 0; i < nameLengths.length; i++)
			sum += nameLengths[i]; // Adds the ith nameLength to the sum.
		
		System.out.println(sum);
		
		// Testing the methods for other questions.
		System.out.println(concatenator("asdf", 4));
		System.out.println(fullNamer("Tamzen", "Bellringer"));
		System.out.println(sumChecker(ages));
		System.out.println(sumChecker(ages2));
		System.out.println(sumChecker(nameLengths));
		
		double[] doubles = {5.2, 48, 6.9, 7.833333, 3.0001};
		System.out.println(avgGetter(doubles));
		
		double[] doubles2 = {5.2, 18, 6.9, 7.833333, 3.0001};
		
		System.out.println(avgComparer(doubles, doubles2));
		System.out.println(avgComparer(doubles2, doubles));
		
		System.out.println(willBuyDrink(false, 11));
		System.out.println(willBuyDrink(true, 10));
		System.out.println(willBuyDrink(true, 11));
		
		System.out.println(annoyChecker("nameLengths"));
		System.out.println(annoyChecker("doubles"));
	}
	
	
	
	// 7. 
	public static String concatenator(String word, int n)
	{
		StringBuilder cat = new StringBuilder(); // Creating an empty string builder.
		
		for(int i = 0; i < n; i++)
			cat.append(word); // Appends word to the stringbuilder n many times.
		
		return cat.toString(); // Returns the stringbuilder, converted to a string.
	}
	
	// 8.
	public static String fullNamer(String firstName, String lastName)
	{
		StringBuilder full = new StringBuilder(firstName); // Starting the stringbuilder off with the first name.
		full.append(" "); // Appends a space to it.
		full.append(lastName); // And now it appends the last name.
		return full.toString(); // Returns it, converted to string.
	}
	
	// 9.
	public static boolean sumChecker(int[] arr)
	{
		int sum = 0; // Have to declare a new sum variable since the other one is out of scope.
		for(int i = 0; i < arr.length; i++)
			sum += arr[i]; // Adds the ith element of arr to sum.
			
		return (sum > 100); // Returns true if sum is greater than 100 and false if it isn't.
	}
	
	// 10.
	public static double avgGetter(double[] arr)
	{
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i]; // Adds each element to sum
		return (sum / arr.length); // Divides the sum by the total and returns that.
	}
	
	// 11.
	public static boolean avgComparer(double[] arr1, double[] arr2)
	{
		return ( avgGetter(arr1) > avgGetter(arr2) ); // Uses the previous method to get the average of the arrays.
	}
	
	// 12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		return (isHotOutside && (moneyInPocket > 10.50)); // Returns true if isHotOutside == true And moneyInPocket is over 10.50.
	}
	
	// 13.
	// This method returns a good guess for whether or not the name of a variable will annoy me. 
	// I created it because it annoys me how a lot of the variables in this course are given such unnecessarily long names.
	public static String annoyChecker (String varName)
	{
		if(varName.length() > 10) 
			return("This variable has a long name and that annoys me.");
		else return("This variable has a sufficiently short name to not annoy me.");
	}
}