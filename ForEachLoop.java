package day20_2dArray;

public class ForEachLoop {

	public static void main(String[] args) {

		
int [][] nums = {{1,2,3,4,5}, {11,22,33,44}, {9,8,6}, {6000}};
        
        for(int a = 0 ; a < nums.length ;a++) {
            for(int b = 0  ; b < nums[a].length ; b++) {
                System.out.println(nums[a][b]);
            }
        }
        System.out.println("----------------");
        
        // syntax
        // for (dataType vaiableName : arrayName) {
            // your code
        //} 
        
//        for (int[] arr: nums) {
//            System.out.println(Arrays.toString(arr));
//        }
//        
        
        for (int[] arr: nums) {
//            System.out.println(Arrays.toString(arr));
            
            for(int num : arr) {
                System.out.println(num);
            }
            
            
        }
        
	}

}
