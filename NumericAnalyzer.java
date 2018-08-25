/**
 * 
 */
package edu.cuny.csi.csc330.lab2;


/**
 * @author Christian Gonzaga
 *
 */

import java.util.Scanner;
public class NumericAnalyzer{

private final static int Selection_Size =7; //there will be 7 numbers in the array
public NumericAnalyzer(String[] args) {
	// TODO Auto-generated constructor stub
}


//this sorts the array and makes them in order
public void selectionSort(int [] NumList)//sorts the User's  numbers

{
	int temp;
	int max;
	
	for(int i =0; i<NumList.length -1;i++)
	{
		max =indexOfLargestElement(NumList, NumList.length -i);
		
		temp = NumList[max];
		NumList[max] = NumList[NumList.length -i -1];
		NumList[NumList.length -i - 1] = temp;
	}
		
}


private static int indexOfLargestElement( int[] Numlist, int size)

{
	int index = 0;
	for(int i = 1; i < size;i++)
	{
		if(Numlist[i] > Numlist[index])
				index = i;
	}
	return index;
}

//This calculates the sum of the array

public int calculate(int[] values)

{
	if(values.length == Selection_Size)//If the array size is 7, this will execute
	{
    int i, total = 0;
    for(i=0; i<Selection_Size; i++)
    {
        total = total + values[ i ];
    }

    return (total);//if the array size has only one element
	}
	else//if the array size is not seven, and only contains one number from the array
	{ 
		int total2 = values[0];//very important to remember this is the first element in the list
		
		return(total2);//returns the only element in the array
		
	}

}	
	
//Here I calculate the Mean value
public int calculateMean(int[] values)
{
if(values.length == Selection_Size)
{
	
	int i, total = 0, mean;
    for(i=0; i<Selection_Size; i++)
    {
        total = total + values[ i ];
    }

	mean = total/Selection_Size;
	
	return(mean);
}
else 	
{
			return values[0];
}

}


//finding the medium of the sorted list


public int calculateMedian(int [] values)

{
	
int middle = values.length/2; // declares the varible in the middle
if(middle>0 && (middle%2) == 0)// if its odd
	{
		return values[middle];
	}
else //if the array is even
	{
		int newMiddle = middle--;//decrements if middle is even and assigns into new middle.
		return values[newMiddle];
	}

	
}



// calculate the range
public int calculateRange(int [] values)
{

int range = values[values.length -1] - values[0];//last element minus the first element
return (range);


}
//getting the maxium value from the array
public int getMaxIndex(int [] values)
{

int maxIndex = values[values.length -1];//this indicates the last element of the array

return(maxIndex);

}

//getting the mininum value from the array
//The array has already been sorted 
public int getMin(int [] values)
{
	int minVal= values[0];//
	
	return(minVal);
	
	
}




//public void display 


protected void displayAnalyzer(int total, int average, int middle, int range, int max, int min)
{   
	int totalSum = total;
	int mean = average;
	int median = middle;
	int ranger = range;
	int maximum = max;
	int minimum = min;
	
	System.out.printf(" Total:     %d", totalSum);
	System.out.printf("\n Mean:      %d", mean);
	System.out.printf("\n Median:    %d", median);
	System.out.printf("\n Range:     %d", ranger);
	System.out.printf("\n Maximum:   %d", maximum);
	System.out.printf("\n Minimum:   %d", minimum);
	System.out.println();//creates a new line

	
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hi!, please enter your number >"); 
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		int num6 = scan.nextInt();
		int num7 = scan.nextInt();
		System.out.printf(" Your numbers are %d %d %d %d %d %d %d", num1, num2, num3, num4, num5,
				num6, num7);
		
		
		
		int [] Numlist = {num1, num2,num3,num4,num5,num6,num7};//inserts the User's number into a list
		NumericAnalyzer analyzeThis = new NumericAnalyzer(args);
		
	//Sorts the users numerical input, from here on, the arrays are sorted in numerical order
	analyzeThis.selectionSort(Numlist);//invokes the selection sort method
		
		System.out.println("\n After selection sort, the array is");
		for (int i =0; i <Numlist.length; i++)
			System.out.print( Numlist[i] + "\t");
		
	System.out.println();

	
	//invoking the calculations
	int total = analyzeThis.calculate(Numlist);
	int average = analyzeThis.calculateMean(Numlist);
	int middle = analyzeThis.calculateMedian(Numlist);
	int range = analyzeThis.calculateRange(Numlist);
	int maximum = analyzeThis.getMaxIndex(Numlist);
	int mininum = analyzeThis.getMin(Numlist);
	analyzeThis.displayAnalyzer(total, average, middle, range, maximum, mininum);	
	
	//here, I created a new array but this time, it only consists of one element input from the user
	//And now i test the methods with only one value
	System.out.println();		
	int [] Numlist2 = {num2};
	System.out.println("This Arrary only consists of one element:" +Numlist2[0]);
	NumericAnalyzer analyzeThat = new NumericAnalyzer(args);
	int total2 = analyzeThat.calculate(Numlist2);
	int average2 = analyzeThat.calculateMean(Numlist2);
	int middle2 = analyzeThat.calculateMedian(Numlist2);
	int range2 = analyzeThat.calculateRange(Numlist2);
	int maximum2 = analyzeThat.getMaxIndex(Numlist2);
	int mininum2 = analyzeThat.getMin(Numlist2);
	analyzeThat.displayAnalyzer(total2, average2, middle2, range2, maximum2, mininum2);
	

	}

}



