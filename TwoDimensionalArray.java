package day20_2dArray;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
        A multidimensional array is an array of arrays.
        each element of your 2 dimensional array is an Array

        Multidimensional arrays are useful when you want to store data as a tabular form, 
        like a table with rows and columns.
       
        To create a two-dimensional array, add each array within its own set of curly braces:
       */
       
       
       // one dimensional array
       // dataType[] arrayName = new dataType[size of the array];
          int[] numbers = new int[3];
       
          numbers[0] = 5;
          numbers[1] = 15;
          numbers[2] = 25;
//                            0  1  2   3
          int[] numbers2 = {2, 4, 6, 10};
//                            0 1  2   3    4
          int[] numbers3 = {1,11,111,1111,11111};
          
//                             0          1          2
          int [][] table = {numbers , numbers3, numbers2};           
          
          
          /// reading value from one dimensional array
          
          System.out.println(numbers[1]); // reading data from one dimensional array -> 15
          
          // reading value from 2 dimensional Array --> i want to get 15 from table.
          
  System.out.println(table[0][1]);
          
          // read 10 from table:
          System.out.println(table[2][3]);
           
          // where is 111
          
          System.out.println(table[1][2]); // 111
          
          
          System.out.println(table.length); // number of element 
          
          //Initialazing an two dimensional Array
          int nums[][] = new int[3][];
          
          System.out.println(nums.length);  //3
          
          nums[0] = numbers;
          nums[1] = numbers2;
          nums[2] = numbers3;
          
//          for () {}
          
          // display all the value from 2 dimensionalArray
          
          System.out.println(Arrays.toString(nums[0])); // 
          
          System.out.println(Arrays.toString(nums[1]));
          System.out.println(Arrays.toString(nums[2]));
          System.out.println(Arrays.toString(nums[nums.length-1]));
          
//                  [5, 15, 25]
//                  [2, 4, 6, 10]
//                  [1, 11, 111, 1111, 11111]
	}

}
