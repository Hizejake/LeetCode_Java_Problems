package language_problems;

import java.util.*;

public class Two_sums {
	
	static int[] Tsum(int[] arr,int target) {
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i-1;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int target = sc.nextInt();
		
		int nums[] = new int[size];
		
		for(int i = 0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(Tsum(nums,target)));
		
		sc.close();
	}

}
