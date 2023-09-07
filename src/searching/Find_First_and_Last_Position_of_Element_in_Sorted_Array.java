package searching;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,7,8,8,10};
		int target = 7;
		
		int nums2 [] = {1};
		int target2 = 1;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));
		System.out.println(Arrays.toString(searchRange(nums2, target2)));

	}

	 public static int[] searchRange(int[] nums, int target) {
		int ans[] = {-1,-1};
		
		ans[0] = search(nums, target, true);
		ans[1] = search(nums, target, false);
		
		return ans;
	    }
	 
	 static int search(int nums[], int target, boolean findfirstIndex) {
		int ans = -1;
		 
		int start = 0;
		int end = nums.length-1;
			
	
			
		while(start<=end) {
				//find the middle element
			int mid = start + (end-start)/2;
				
			if(target < nums[mid]) end = mid-1;
					
			else if(target > nums[mid]) start = mid+1;
					
			else if(target == nums[mid]) {
				ans = mid;		// now this is a potential answer//
				if(findfirstIndex) {
					end = mid -1;
				}else
					start = mid+1;
			}
	 }
		
		return ans;
	
}
}
