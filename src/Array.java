import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
// 1.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// a.
		int lengthOfArray = ages.length;
		int firstMinusLast = Math.abs(ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);
		System.out.println("Difference: "+ firstMinusLast);
		
        // b. 
		int newAgeArray [] =  new int [lengthOfArray + 1];
		int value = 97;
		
		for( int i = 0; i < lengthOfArray; i++) {
			newAgeArray[i] = ages[i];
		}
		newAgeArray[lengthOfArray] = value;
		System.out.println(Arrays.toString(newAgeArray));
		
		int lengthOfNewArray = newAgeArray.length;
		int firstMinusLastNewArray = Math.abs(ages[lengthOfNewArray - lengthOfNewArray] - newAgeArray[lengthOfNewArray - 1]);
		System.out.println("New Difference: "+ firstMinusLastNewArray);
		
		// c.
		int sum = 0;
		for (int i = 0; i < newAgeArray.length; i++ ) {
			sum += newAgeArray[i];	
		}
		double averageAge = sum / lengthOfNewArray;
		System.out.println("Average: " + averageAge);
		
//2. 
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a
		int sumNames = 0;
		int lengthOfArrayNames = names.length;
		
		for(int i = 0; i < names.length; i++ ) {
			sumNames += names[i].length();

		}
		double average = sumNames / lengthOfArrayNames;
		System.out.println("Average number of letters: "+ average );
		
		// b
		 String allNames = "";
		 for(int i = 0; i < names.length; i++) {
			 allNames += names[i] + " ";  
		 }
		 System.out.println(allNames);
		 
//3.
		 String lastElement = names[names.length -1];
		 System.out.println(lastElement);
		 
//4.
		 String firstElement = names[0];
		 System.out.println(firstElement);
		 
//5. 
		 int [] nameLengths = new int [names.length];
		 for (int i = 0; i < names.length; i ++ ) {
			 nameLengths[i] = names[i].length();
		 }

//6. 
		 sumNames = 0;
		 for (int i = 0; i < nameLengths.length; i++) {
			 sumNames += nameLengths[0];	 
		 }
		 System.out.println("The sum of length: " + sumNames);	 
		 
//7.
		 System.out.println(concatenatedWord("Hello", 5));
		 
//8.
		 String firstName = "John";
		 String lastName = "Doe";
		 String fullName = createFullName(firstName ,lastName);
		 System.out.println(fullName);
		 
//9.	
		 int [] numbs = {3, 9, 23, 64, 2, 8, 28};
		 int num = 100;
		 boolean result = true;
		 result = sumGraterThan(numbs, num);
		 
		 System.out.println(result);

//10.	 
		 double[] arr = {19, 12.89, 16.5, 200, 13.7};
		 
		 System.out.println("Average: " + average(arr));
		 
// 11.
		 int [] array1 = {3, 9, 23, 64, 2, 8, 28,30,34};
		 int [] array2 = {3, 9, 23, 64, 2, 8, 28};
			
		 boolean result1 = true; 
		 result1 = equal(array1, array2);

		 System.out.println(result1);
		 
// 12.
		 boolean isHotOutside = true;
		 double moneyInPocket = 20;
		 boolean result2 = willBuyDrink(isHotOutside,moneyInPocket);
		 System.out.println(result2);
		 
//13.		 
		 int [] arrayOne = {3, 9, 23, 64, 2, 8, 28,30,34};
		 int [] arrayTwo = {3, 9, 23, 64, 2, 8, 28};
		 
		 if ( equals(arrayOne, arrayTwo)) {
				System.out.println("The same");
			}else {
				System.out.println("Different");
			}
	}

//7.Write a method 
	public static String concatenatedWord(String str, int num) {
		 String result = "";
		 for (int i = 0; i < num; i++) {
			 result += str; 
		 }
		 return result;
	 }
//8. Write a method 
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
// 9.Write a method 
	public static boolean sumGraterThan(int[] numbs, int num) {
		int result = 0; 
		for (int i : numbs) {
			result += i; 
			
			if (result > num) {
				return true;
			}
		}
		return false;
	}
//10 Write a method
	public static double average (double[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total / arr.length;
	}
//11. Write a method 
	public static boolean equal(int [] array1, int []array2) {
		if (array1.length > array2.length){
			return true;
		}
		return false;
	 }
//12.Write a method  
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;	
		}
		return false;	
	}
//13. Write a method that compare two arrays and check if they have the same length and the same element in arrays
	public static boolean equals(int [] arrayOne, int []arrayTwo) {
		if (arrayOne.length != arrayTwo.length) {
			return false;
		}
		for(int i = 0; i < arrayOne.length;i++ ) {
			if(arrayOne[i] != arrayTwo[i]) {
				return false;
			}
		}
		return true;
	}
}
