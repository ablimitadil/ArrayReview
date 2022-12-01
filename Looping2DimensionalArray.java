package day20_2dArray;

public class Looping2DimensionalArray {

	public static void main(String[] args) {
//      0            1              2         3
int [][] nums = {{1,2,3,4,5}, {11,22,33,44}, {9,8,6}, {6000}};

System.out.println(nums.length); // number of element in nums Array

//for(int i = 0 ; i < nums.length ; i++) {
//System.out.println(i); // index
//
//// display all the value
////System.out.println(nums[i]); // memory location
//System.out.println(Arrays.toString(nums[i])); 
//
//}
System.out.println("-------------------------------");

for(int i = 0 ; i < nums.length ; i++) {

//System.out.println(Arrays.toString(nums[i])); 

for(int k = 0 ; k < nums[i].length; k++) {
System.out.println(nums[i][k]);
}

System.out.println("-------------------------------");
}

// where is 22 in nums array
//System.out.println(nums[1][1]);
//System.out.println(nums[2][1]);









	}

}
