package searching;
import java.util.*;
public class Even_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] =  {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
		System.out.println(Integer.toString(nums[1]).length());
	}
	
	 static int findNumbers(int nums[]) {
		int count = 0;
		
		for(int element:nums) if(numdigit2(element)%2==0) count++;
		
		return count;
	}

	 static int numdigit(int element) {
		// TODO Auto-generated method stub
		 int count2 = 0;
		 
		 if(element<0) element = element * -1;
		 
		 
		 while(element>0) {
			 count2++;
			 element = element/10;
		 }
		 
		return count2;
	}
	 
	 static int numdigit2(int element) {
		 return (int)(Math.log10(element)+1);
	 }

}
