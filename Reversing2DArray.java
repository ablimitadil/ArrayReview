package day20_2dArray;

import java.util.Arrays;

public class Reversing2DArray {

	public static void main(String[] args) {

int [][] nums = {{1,2,3,4,5}, {11,22,33,44}, {9,8,6}, {6000}};
        
        System.out.println(nums[3]); // memory location
        System.out.println(nums[2]);
        System.out.println(nums[1]);
        System.out.println(nums[0]);
        
        System.out.println(Arrays.toString(nums[3]));
        System.out.println(Arrays.toString(nums[2]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[0]));
        
        
        for (int i = nums.length-1 ; i >= 0 ; i--) {
//            System.out.println(i);
            
            System.out.println(Arrays.toString(nums[i]));
            
        }
        
        int [][] reverseArr = new int[nums.length][];
        
        System.out.println(reverseArr.length);
        
        int indexPosition = 0;
        
        
        for (int i = nums.length-1 ; i >= 0 ; i--) {
//            System.out.println(i);
            
        //    System.out.println(Arrays.toString(nums[i]));
            
            reverseArr[indexPosition] = nums[i];
            indexPosition++;
        }
        
        
        System.out.println("===================");
        
        for (int i = 0 ; i < reverseArr.length ; i++) {
            System.out.println(Arrays.toString(reverseArr[i]));
        }
        
		
		
		
		
		
		
		
		
		
	}

}
