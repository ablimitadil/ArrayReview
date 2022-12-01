package day20_2dArray;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		
//      What's an array?
//      - Object
//      - Collection of data that has same type, fixed size , index starts 0 
      
      String names[] = new String[5];
      
      // reading data from names array
      System.out.println(names[0]); // null
      
      // Assigning value to names array
      names[0] = "Hannah";
      
      names[4] = "Elzat";
      
      
      System.out.println(names[0]); // reading first value from the names array,.
      
      // element count 
      System.out.println(names.length); /// return number of element 
      
      
      // Displaying all the value from names array as a string
      System.out.println(Arrays.toString(names)); // [Hannah, null, null, null, Elzat]
      
      
      // When you don't need the index position , if you only want to access each element of your array
      // use for each loop. 
      
      // Syntax of for each loop
      // for (dataType yourVariableName : NameOfyourArray) {
//          your statement
      //}
      
      for (String n : names) {
      //    System.out.println(n); /// n is each element of names array. 
          // display if the element is not equals to null
          
//          if (!n.equals(null)) {
//              System.out.println(n);
//          }
          
          if (n != null) {
              System.out.println(n);
          }
          
          
          
      }
      
      // if you need index position of the array use for loop
      
      for (int i = 0 ; i < names.length ; i++) {
          // <i> means index position of the names array
//          System.out.println(i); // print all the index of the names array : 0 ,1 , 2, 3, 4
          
          // read value from names array
          //System.out.println(names[i]); // names[0] , names[1] , names[2], names[3], names[4]
          
          // Which index position has null value. 
          
          if (names[i] == null) {
              System.out.println(i);
          }
          
      }
		
		
		
		
		
		
		
		

	}

}
